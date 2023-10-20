package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoblazeCartPage extends Base {
	protected By placeOrderButton = By.xpath("//button[contains(text(),'Place Order')]");	
	protected By purchaseButton = By.xpath("//button[contains(text(),'Purchase')]");
	protected By confirmation = By.className("sa-placeholder");
	protected By nameField = By.id("name");
	protected By countryField = By.id("country");
	protected By cityField = By.id("city");
	protected By cardField = By.id("card");
	protected By monthField = By.id("month");
	protected By yearField = By.id("year");
	protected By purchaseInfo = By.xpath("//body/div[10]/p[1]");
	
	public DemoblazeCartPage(WebDriver driver) {
		super(driver);
	}
	
	public void fillOrder(String name, String country, String city, String card, String month, String year) {
		click(placeOrderButton);
		type(name, nameField);
		type(country, countryField);
		type(city, cityField);
		type(card, cardField);
		type(month, monthField);
		type(year, yearField);
		click(purchaseButton);
	}
	
	public WebElement getPurchaseInfo() {
		return findElement(purchaseInfo);
	}	
	
	public boolean getConfirmation() {
		return isDisplayed(confirmation);
	}
}