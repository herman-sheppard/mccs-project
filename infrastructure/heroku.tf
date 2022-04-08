 resource "heroku_app" "mccs_staging" {
   name   = "mccs-staging"
   region = "eu"

   buildpacks = [
     "heroku/gradle"
   ]
 }

 resource "heroku_addon" "mccs_staging_db" {
   app  = heroku_app.mccs_staging.id
   plan = "heroku-postgresql:hobby-dev"
 }

 resource "heroku_pipeline" "mccs_pipeline" {
   name = "mccs-build-pipeline"
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

 resource "herokux_app_github_integration" "mccs_gh_integration" {
   app_id = heroku_app.mccs_staging.uuid
   branch = "master"
   auto_deploy = true
   wait_for_ci = true

   depends_on = [herokux_pipeline_github_integration.pipeline_integration]
 }