package starter.navigation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


public class LoginPage extends PageObject {
	
	@FindBy(xpath = "//input[@id='username']")
	public WebElementFacade userName;

	@FindBy(xpath = "//input[@id='password']")
	public WebElementFacade password;
	
	@FindBy(xpath = "//button[contains(.,'Login')]")
	public WebElementFacade btnLogin;
	
	@FindBy(xpath = "//span[@data-testid='login__error--server']")
	public WebElementFacade errorMessage;

	

	public void userEntersWithUsernamePassword(String usr, String pwd) {
		userName.sendKeys(usr);
		password.sendKeys(pwd);
		btnLogin.click();
	}
	
	public void validateErrorMessageForInvalidUserNameAndPwd() {
		String expected ="Invalid username or password. Please try again";
		String actual = errorMessage.getText();
		assertEquals(expected, actual);
	}

}
