package infrastructure.controller

import org.scalatest.{GivenWhenThen, featurespec}

class PlayerControllerTest
    extends featurespec.AnyFeatureSpec
    with GivenWhenThen {
//todo: quizá pierde el sentido si hacemos un test de integració
  Feature("I want to be able to create players") {

    info("1st approach =)")
    info("As User")

    Scenario("domain.player is created when email does not exist on our system") {

      Given("I'm a user")
      And(
        "I'm requested to create a domain.player with name, surname and email"
      )
      When("I create a domain.player with that criteria")
      And("email does not exist on our system")
      Then("domain.player is created")
    }

    Scenario("domain.player is NOT created when email does exist on our system") {

      Given("I'm a user")
      And(
        "I'm requested to create a domain.player with name, surname and email"
      )
      When("I create a domain.player with that criteria")
      And("email is already registered")
      Then("domain.player is not created and message info is displayed")
    }
  }
}
