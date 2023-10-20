package POM;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage extends Base {
	protected By searchBar = By.id("APjFqb");
	protected By suggestions = By.cssSelector("[jsaction=\"click:.CLIENT;mouseover:.CLIENT\"]");

	public GooglePage(WebDriver driver) {
		super(driver);
	}
	
	public void search(String keyword) {
		click(searchBar);
		type(keyword, searchBar);
	}
	
	public void clearSearchBar() {
		findElement(searchBar).clear();
	}
	
	public void clickFirstResult() {
		List<WebElement> resultList = findElements(suggestions);
		resultList.get(0).click();
	}
	
	public List<WebElement> getSuggestions(){
			return findElements(suggestions);
	}	
}