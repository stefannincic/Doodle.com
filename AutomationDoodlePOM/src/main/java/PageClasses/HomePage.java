package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver webDriver;
	
	public HomePage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	@FindBy(className = "CreatePollMenu-createMenuLabel")
	public WebElement createButton;
	
	@FindBy(xpath = "//div[text()='Group poll']")
	public WebElement groupPollField;
	
	@FindBy(xpath = "//h2//span[text()='Welcome to Doodle Premium']")
	public WebElement welcomeLogo;
	
	public GroupPollPage createGroupPoll() {
		groupPollField.click();
		return PageFactory.initElements(webDriver, GroupPollPage.class);
	}
	
	public void clickOnCreate() {
		createButton.click();
	}
	
}
