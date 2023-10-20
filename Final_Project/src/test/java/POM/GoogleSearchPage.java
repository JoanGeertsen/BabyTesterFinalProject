package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage extends Base {
	protected By results = By.cssSelector("[jsname=\"UWckNb\"]");
	
	public GoogleSearchPage(WebDriver driver) {
		super(driver);
	}	
	
	public WebElement getFirstResult() {
		return (WebElement) findElements(results).get(0);	
	}	
}