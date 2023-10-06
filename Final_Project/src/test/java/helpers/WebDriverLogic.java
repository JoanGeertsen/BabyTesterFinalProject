package helpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverLogic {
	public WebDriver driver;
	
	public WebDriverLogic() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");  
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public void openUrl(String url) {
		driver.get(url);
	}
}