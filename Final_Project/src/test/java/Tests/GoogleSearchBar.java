package Tests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import POM.GooglePage;
import POM.GoogleSearchPage;
import helpers.HelperGoogle;
import helpers.WebDriverLogic;

public class GoogleSearchBar {
	private WebDriverLogic driverLogic;
	protected WebDriver driver;
	protected GooglePage google;
	protected GoogleSearchPage searchPage;
	protected HelperGoogle helper;	
	protected String url = "https://www.google.com/";
	protected String firstKeyword="auto";
	protected String secondKeyword="automation";	
	
	@BeforeTest
	public void setup() {
		driverLogic = new WebDriverLogic();
		driver = driverLogic.driver;
		driverLogic.openUrl(url);		
	}
	
	@Test
	public void TestSearchSuggestions() {
		google = new GooglePage(driver);
		helper = new HelperGoogle(google);
		
		helper.searchAndPrintSuggestions(firstKeyword);		
		google.clearSearchBar();		
		helper.searchAndPrintSuggestions(secondKeyword);		
		Assert.assertTrue(helper.noMatchBetweenLists());
		google.clickFirstResult();
		
		searchPage = new GoogleSearchPage(driver);
		Assert.assertTrue(searchPage.getFirstResult().getText().contains("store.steampowered.com"));		
	}
	
	@AfterTest
	public void close() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.quit();
	}
}
