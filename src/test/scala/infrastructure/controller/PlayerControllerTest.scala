package infrastructure.controller

import org.scalatest.{GivenWhenThen, featurespec}

class PlayerControllerTest
    extends featurespec.AnyFeatureSpec
    with GivenWhenThen {

  Feature("I want to be able to create players") {

    info("1st approach =)")
    info("As User")

    Scenario("player is created when email does not exist on our system") {

      Given("I'm a user")
      And("I'm requested to create a player with name, surname and email")
      When("I create a player with that criteria")
      And("email does not exist on our system")
      Then("player is created")
    }

    Scenario("player is NOT created when email does exist on our system") {

      Given("I'm a user")
      And("I'm requested to create a player with name, surname and email")
      When("I create a player with that criteria")
      And("email is already registered")
      Then("player is not created and message info is displayed")
    }
  }
}
