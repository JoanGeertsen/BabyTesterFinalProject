package stepDefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import POM.DemoblazeCartPage;
import POM.DemoblazeHomePage;
import POM.DemoblazeNavbar;
import POM.DemoblazeProductPage;
import helpers.HelperPurchase;
import helpers.WebDriverLogic;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Purchase {
	private WebDriverLogic driverLogic;
	protected WebDriver driver;	
	protected HelperPurchase helper;
	protected DemoblazeHomePage homePage;
	protected DemoblazeProductPage productPage;
	protected DemoblazeNavbar navbar;
	protected DemoblazeCartPage cartPage;
	
	@Before
	public void setup() {
		driverLogic = new WebDriverLogic();
		driver = driverLogic.driver;		
		productPage = new DemoblazeProductPage(driver);
		homePage = new DemoblazeHomePage(driver);
		cartPage = new DemoblazeCartPage(driver);
		navbar = new DemoblazeNavbar(driver);
		helper = new HelperPurchase(cartPage);
	}
	
	@Given("I am on the home page")
		public void openHomePage(){			
			driverLogic.openUrl("https://demoblaze.com/index.html");
	}	
	
	@And("I add a {string} from the {string} page to the cart")
		public void addProductToCart(String product, String category) {
			homePage.chooseCategory(category);
			homePage.clickProduct(product);
			Assert.assertTrue(productPage.getCurrentUrl().contains("prod"));
			productPage.clickAddButton();
			productPage.acceptAlert();
			navbar.clickHomeButton();
	}
	
	@When("complete the purchase")
		public void completePurchase() {
			navbar.clickCartButton();
			Assert.assertTrue(cartPage.getCurrentUrl().contains("cart"));
			helper.fillPlaceOrder();
	}
	
	@Then("I should get a message with a confirmation")
	public void checkConfirmation() {
		Assert.assertTrue(cartPage.getConfirmation());
		WebElement purchaseInfo = cartPage.getPurchaseInfo();
		Assert.assertTrue(helper.checkInfoIsCorrect(purchaseInfo.getText()));
		}
	
	@After
	public void close() {
		driverLogic.tearDown();
	}	
}