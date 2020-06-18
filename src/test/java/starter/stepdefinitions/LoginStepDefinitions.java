package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Steps;

import starter.search.LoginStep;



public class LoginStepDefinitions {
	@Steps
	LoginStep loginStep;
	

	@When("^user enters with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_with_and(String username, String pwd) {
		loginStep.userEnterswithUserNameAndPwd(username, pwd);
	}
	
	@Then("user should not be logged in")
	public void theUserShouldNotBeLoggedIn() {
		loginStep.userShouldSeeTheErrorMessage();
	}

	
}
