package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoblazeNavbar extends Base {
	protected By homeButton = By.id("nava");
	protected By cartButton = By.id("cartur");	
	
	public DemoblazeNavbar(WebDriver driver) {
		super(driver);
	}
	
	public void clickHomeButton() {
		click(homeButton);
	}
	
	public void clickCartButton() {
		click(cartButton);
	}	
}