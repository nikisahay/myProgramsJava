package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Helper {

	public static WebDriver webdriver;
	
	public static WebDriver launchBrowser(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			if(browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "");
				webdriver = new FirefoxDriver();
			}
			if(browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "");
				webdriver = new InternetExplorerDriver();
			}
			if(browserName.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Project related\\drivers\\chromedriver.exe");
				webdriver = new ChromeDriver();
			}
		}
			return webdriver;
	}
	
	public static void launchURL(String url) {
		webdriver.manage().window().maximize();
		webdriver.get(url);
		webdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
}
