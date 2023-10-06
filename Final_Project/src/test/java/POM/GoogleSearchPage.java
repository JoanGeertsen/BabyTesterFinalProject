package POM;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage extends Base {
	protected By results = By.cssSelector("[jsname=\"UWckNb\"]");
	
	public GoogleSearchPage(WebDriver driver) {
		super(driver);
	}	
	
	public WebElement getFirstResult() {
		List<WebElement> listAux;
		if(isDisplayed(results));
			listAux= findElements(results);
		return listAux.get(0);		
	}	
}