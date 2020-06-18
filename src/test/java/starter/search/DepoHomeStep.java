package starter.search;

import net.thucydides.core.annotations.Step;
import starter.navigation.DepoHomePage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DepoHomeStep {
	DepoHomePage depohomePage;

	@Step
	public void openDepoWebsite() {
		depohomePage.getDriver().manage().deleteAllCookies();
		depohomePage.getDriver().manage().window().maximize();
		depohomePage.open();
	}
	
	@Step
	public void clickLoginLink(){
		depohomePage.clickLogin();
	}
	
	@Step
	public void theUserShouldBeLoggedIn() {
		depohomePage.userShouldBeLoggedIn();
	}

}
