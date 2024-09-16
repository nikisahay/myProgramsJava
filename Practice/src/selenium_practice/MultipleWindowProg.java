package selenium_practice;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.WindowType;

public class MultipleWindowProg {

	public static void main(String[] args) throws IOException{
		// this program is to open a url and capture the screenshot and then open a new tab 
		//and capture the title and switch control back to parent tab
		
		System.setProperty("webdriver.gecko.driver","C:\\Project related\\drivers\\geckodriver-v0.34.0-win32\\geckodriver.exe");
	       //DesiredCapabilities capab = new DesiredCapabilities();
	       WebDriver driver = new FirefoxDriver();
	       try {
	       driver.get("https://www.shopify.com/blog/best-ecommerce-sites");
	       driver.manage().window().maximize();
	       
	       // Step 2: Capture screenshot of the parent tab
	       File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
           FileHandler.copy(screenshot, new File("screenshot_parent_tab.png"));
           System.out.println("Screenshot of the parent tab saved.");

           // Step 3: Open a new tab
           ((JavascriptExecutor) driver).executeScript("window.open();");
           //driver.switchTo().newWindow(WindowType.WINDOW);
           //driver.switchTo().newWindow(WindowType.TAB);
          
           //switch to the new tab
           ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
           driver.switchTo().window(tab.get(1));
           
           //open an URL
           driver.get("https://www.bigcommerce.com/articles/ecommerce/best-ecommerce-website-design/");
           
           //open a new tab
           String newTabTitle = driver.getTitle();
           System.out.println("Title of the new tab: " + newTabTitle);

           // Step 6: Switch back to the parent tab
           driver.switchTo().window(tab.get(0));
           driver.getTitle();

       } catch (Exception e) {
           e.printStackTrace();
       } finally {
           // Close browser
           driver.quit();
       }

	}

}
