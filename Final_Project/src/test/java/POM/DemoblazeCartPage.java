package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoblazeCartPage extends Base {
	protected By palceOrderButton = By.xpath("//button[contains(text(),'Place Order')]");	
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
	
	public WebElement getPurchaseInfo() {
		return findElement(purchaseInfo);
	}	
	
	public boolean getConfirmation() {
		return isDisplayed(confirmation);
	}
	
	public void clickPlaceOrder() {
		click(palceOrderButton);
	}
	
	public void clickPurchase() {
		click(purchaseButton);
	}
	
	public void fillName(String name) {
		type(name, nameField);
	}
	
	public void fillCountry(String country) {
		type(country, countryField);
	}
	
	public void fillCity(String city) {
		type(city, cityField);
	}
	
	public void fillCard(String card) {
		type(card, cardField);
	}
	
	public void fillMonth(String month) {
		type(month, monthField);
	}
	
	public void fillYear(String year) {
		type(year, yearField);
	}
}