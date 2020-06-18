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

@DefaultUrl("https://www.depop.com/")
public class DepoHomePage extends PageObject {
	
	@FindBy(xpath = "//a[@href='/login/']")
	public WebElementFacade linkLogin;
	
	@FindBy(xpath = "//button[contains(.,'Logout')]")
	public WebElementFacade linkLogOut;
	
	public void clickLogin(){
		linkLogin.click();
	}
	
	public void userShouldBeLoggedIn() {
		assertTrue("User is not logged In!", linkLogOut.isDisabled());
	}

}
