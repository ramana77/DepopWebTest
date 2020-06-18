package starter.search;

import net.thucydides.core.annotations.Step;
import starter.navigation.LoginPage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginStep {
	LoginPage loginPage;

	@Step
	public void userEnterswithUserNameAndPwd(String usr, String pwd) {
		loginPage.userEntersWithUsernamePassword(usr, pwd);
	}
	
	@Step
	public void userShouldSeeTheErrorMessage() {
		loginPage.validateErrorMessageForInvalidUserNameAndPwd();
	}

}
