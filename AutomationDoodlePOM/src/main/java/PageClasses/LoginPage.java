package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver webDriver;
	
	public LoginPage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	@FindBy(id="username")
	public WebElement emailField;
	@FindBy(id="password")
	public WebElement passwordField;
	@FindBy(name="login")
	public WebElement loginButton;

	public HomePage clickOnLogInButton() {
		loginButton.click();
		return PageFactory.initElements(webDriver, HomePage.class);
	}
	
}
