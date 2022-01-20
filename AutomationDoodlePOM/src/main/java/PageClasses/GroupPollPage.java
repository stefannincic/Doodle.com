package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GroupPollPage {

	WebDriver webDriver;
	
	public GroupPollPage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	@FindBy(xpath = "//span[text()='Title']//..//span[2]//input")
	public WebElement titleField;
	
	@FindBy(xpath = "//div[@class='rbc-row']")
	public WebElement dateField;
	
	@FindBy(name = "meetingSubmit")
	public WebElement createInviteAndContinue;
	
	@FindBy(xpath = "//div[@class='CalendarHeader__navigation_arrows']//div[2]//button")
	public WebElement arrowRight;
	
	@FindBy(className = "Button Button--blue")
	public WebElement shareInvite;

}
