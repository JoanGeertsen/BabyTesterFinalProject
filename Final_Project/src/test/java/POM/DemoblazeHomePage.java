package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoblazeHomePage extends Base {
	protected By phonesButton = By.cssSelector("[onclick=\"byCat('phone')\"]");
	protected By laptopsButton = By.cssSelector("[onclick=\"byCat('notebook')\"]");
	protected By monitorsButton = By.cssSelector("[onclick=\"byCat('monitor')\"]");
	
	public DemoblazeHomePage(WebDriver driver) {
		super(driver);
	}
	
	public void clickProduct(String product) {
		By productLocator = By.xpath("//a[contains(text(),'" + product + "')]");
		click(productLocator);
	}
	
	public void clickPhoneButton() {
		click(phonesButton);
	}
	
	public void clickLaptopButton() {
		click(laptopsButton);
	}
	
	public void clickMonitorButton() {
		click(monitorsButton);
	}	
}
