package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Steps;

import starter.search.DepoHomeStep;



public class HomePageStepDefinitions {
	@Steps
	DepoHomeStep depohomeStep;

	@Given("the user launches Depo website")
	public void userLaunchesDepoWebsite() {
		depohomeStep.openDepoWebsite();
	}
	
	@When("the user clicks on login from home page")
	public void theUserClicksOnLoginFromHomePage() {
		depohomeStep.clickLoginLink();
	}
	
	@Then("user should be logged in")
	public void user_should_be_logged_in() {
		depohomeStep.theUserShouldBeLoggedIn();
	}
	
	
}
