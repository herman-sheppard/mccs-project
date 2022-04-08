terraform {

  required_providers {
    heroku = {
      source = "heroku/heroku"
      version = "4.8.0"
    }

    herokux = {
      source = "davidji99/herokux"
      version = "0.33.0"
    }
  }

  backend "remote" {
    organization = "herman-sheppard"

    workspaces {
      name = "mccs-project"
    }
  }

  required_version = ">=1.1.7"
}

provider "heroku" {
  email = var.heroku_email
  api_key = var.heroku_api_key
}

provider "herokux" {
  api_key = var.heroku_api_key
}