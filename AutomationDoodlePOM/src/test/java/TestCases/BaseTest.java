package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

import PageClasses.LandingPage;


public class BaseTest {
	
	protected static WebDriver webDriver;
	protected static String website = "https://doodle.com/en/";
	protected static String username = "stefannincic91@gmail.com";
	protected static String password = "stefanfon91";
	
	/**
	 * Web driver startup with maximizing the browser window.
	 * 
	 * @return Web driver.
	 */
	public WebDriver startWebDriver() {
		if (webDriver == null)
			System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver.exe");
		webDriver = new ChromeDriver();
		webDriver.get(website);
		webDriver.manage().window().maximize();
		return webDriver;
	}

	/**
	 * Closing the web driver.
	 */
	public void closeWebDriver() {
		if (webDriver != null)
			webDriver.quit();
	}
	
	public LandingPage getLandingPage() {
		webDriver = startWebDriver();
		LandingPage landingPage = PageFactory.initElements(webDriver, LandingPage.class);
		return landingPage;
	}

	@AfterClass(alwaysRun = true)
	public void afterSuite() {
		this.closeWebDriver();
	}

}
