package POM;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Base {
	protected static WebDriver driver;
	protected static WebDriverWait wait;
	
	public Base(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public String getSource() {
		return driver.getPageSource();
	}
	
	public WebElement findElement(By locator) {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		return driver.findElement(locator);
	}
	
	public List<WebElement> findElements(By locator){
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		return driver.findElements(locator);
	}
	
	public void type(String text, By locator) {
		WebElement element = findElement(locator);
		element.sendKeys(text);
	}	
	
	public boolean isDisplayed(By locator) {
		WebElement element = findElement(locator);
		return element.isDisplayed();
	}
	
	public void click(By locator) {
		WebElement element = findElement(locator);
		element.click();
	}
	
	public String getText(By locator) {
		WebElement element = findElement(locator);
		return element.getText();
	}
	
	public static Alert switchToAlert() {
		wait.until(ExpectedConditions.alertIsPresent());
		return driver.switchTo().alert();
	}
}