package POM;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoblazeProductPage extends Base {
	protected By addButton = By.xpath("//a[contains(text(),'Add to cart')]");	
	
	public DemoblazeProductPage(WebDriver driver) {
		super(driver);
	}	
	
	public void clickAddButton() {
		click(addButton);
	}
	
	public void acceptAlert() {
		Alert alert = switchToAlert();
		alert.accept();
	}	
}