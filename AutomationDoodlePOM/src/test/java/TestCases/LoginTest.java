package TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageClasses.GroupPollPage;
import PageClasses.HomePage;
import PageClasses.LandingPage;
import PageClasses.LoginPage;

public class LoginTest extends BaseTest {
	
	LandingPage landingPage;
	LoginPage loginPage;
	HomePage homePage;
	GroupPollPage groupPollPage;
	
	@BeforeClass(alwaysRun = true)
	public void setUp() {	
		landingPage = getLandingPage();
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		landingPage.acceptAllCookies.click();
	}

	@Test
	public void createGroupPoll() {
		
		// Verify that Landing page is displayed
		Assert.assertEquals(webDriver.getTitle(), "Free online meeting scheduling tool | Doodle", "Landing page is not displayed");
		
		// Log on Doodle free trial
		loginPage = landingPage.clickOnLogIn();
		loginPage.emailField.sendKeys(username);
		loginPage.passwordField.sendKeys(password);
		homePage = loginPage.clickOnLogInButton();
		
		// Verify that we are on Home Page
		Assert.assertTrue(homePage.welcomeLogo.isDisplayed(), "Log in is failed");
		
		// Create Group Poll
		homePage.clickOnCreate();
		groupPollPage = homePage.createGroupPoll();
		groupPollPage.titleField.sendKeys("TestPool");
		groupPollPage.arrowRight.click();
		groupPollPage.dateField.click();
		groupPollPage.createInviteAndContinue.click();
		
		// Verify that Group Poll is created and page for Share Invite is displayed
		Assert.assertEquals(webDriver.getTitle(), "Doodle");
	}
}
