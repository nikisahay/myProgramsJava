package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import common.Helper;

public class BaseAction {
	
	public WebDriver initializedriver;
	
	public void initilizeBrowser(String browserName,String url)
	{
		initializedriver = Helper.launchBrowser(browserName);
		Helper.launchURL(url);
	}
	
	public WebDriver startApp(WebDriver driver,String appURL)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Project related\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		return driver;
	}
	
	public void closeDriver(WebDriver driver) {
		driver.quit();
	}
     
	public WebDriver getDriver() {
       return initializedriver;
    }
     
}
