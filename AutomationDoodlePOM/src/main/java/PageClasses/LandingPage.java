package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver webDriver;
	
	public LandingPage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	@FindBy(xpath = "//li//span[text()='Log in']")
	public WebElement logInButton;
	
	@FindBy(id="onetrust-accept-btn-handler")
	public WebElement acceptAllCookies;
	
	public LoginPage clickOnLogIn() {
		logInButton.click();
		return PageFactory.initElements(webDriver, LoginPage.class);
	}

}
