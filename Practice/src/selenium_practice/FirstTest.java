package selenium_practice;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.firefox.FirefoxDriver;  
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Project related\\drivers\\geckodriver-v0.34.0-win32\\geckodriver.exe");
	     // Initialize Gecko Driver using Desired Capabilities Class  
	    //FirefoxOptions options = new FirefoxOptions();
	    WebDriver driver = new FirefoxDriver();
		
	    try {
		driver.navigate().to("http://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[contains(@aria-label,'Search')]")).sendKeys("javatpoint-tutorials");
		new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.name("btnK"))).click();
		//driver.findElement(By.name("btnK")).click();
	    }
	    finally {
	    	driver.quit();
	    }
	}
}
