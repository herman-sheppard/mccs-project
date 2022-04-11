 resource "heroku_app" "mccs_staging" {
   name   = "mccs-staging"
   region = "eu"
   config_vars = {
     JMIX_PREMIUM_USER = var.JMIX_PREMIUM_USER
     JMIX_PREMIUM_PASSWORD = var.JMIX_PREMIUM_PASSWORD
   }

   buildpacks = [
     "heroku/gradle"
   ]
 }

 resource "heroku_addon" "mccs_staging_db" {
   app  = heroku_app.mccs_staging.id
   plan = "heroku-postgresql:standard-0"
 }

 resource "heroku_addon" "mccs_staging_cloudcube" {
   app  = heroku_app.mccs_staging.id
   plan = "cloudcube:hobby"
 }

 resource "heroku_pipeline" "mccs_pipeline" {
   name = "mccs-pipeline"
 }

 resource "heroku_pipeline_coupling" "staging_pipeline_coupling" {
   app      = heroku_app.mccs_staging.id
   pipeline = heroku_pipeline.mccs_pipeline.id
   stage    = "staging"
 }

 resource "herokux_pipeline_github_integration" "pipeline_integration" {
   pipeline_id = heroku_pipeline.mccs_pipeline.id
   org_repo = "herman-sheppard/mccs-project"
 }

 resource "herokux_app_github_integration" "mccs_project_gh_integration" {
   app_id = heroku_app.mccs_staging.uuid
   branch = "master"
   auto_deploy = true
   wait_for_ci = true

   depends_on = [herokux_pipeline_github_integration.pipeline_integration]
 }