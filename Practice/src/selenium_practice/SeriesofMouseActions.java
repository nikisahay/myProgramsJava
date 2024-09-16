package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SeriesofMouseActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseUrl = "http://www.facebook.com/";
		System.setProperty("webdriver.gecko.driver","C:\\Project related\\drivers\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
//		driver.get(baseUrl);
//		WebElement txtUsername = driver.findElement(By.id("email"));
//
//		Actions builder = new Actions(driver);
//		Action seriesOfActions = builder
//			.moveToElement(txtUsername)
//			.click()
//			.keyDown(txtUsername, Keys.SHIFT)
//			.sendKeys(txtUsername, "hello")
//			.keyUp(txtUsername, Keys.SHIFT)
//			.doubleClick(txtUsername)
//			.contextClick()
//			.build();
//	    	seriesOfActions.perform() ;
		   driver.get("https://www.shopify.com/blog/best-ecommerce-sites");
	       //TakesScreenshot screenshot = new TakesScreenshot();
	       String str = driver.getWindowHandle();
	       System.out.println(driver.getTitle());
	       driver.get("https://www.bigcommerce.com/articles/ecommerce/best-ecommerce-website-design/");
	       System.out.println(driver.getTitle());
	       driver.switchTo().window(str);
	       System.out.println(driver.getTitle());
	       driver.close();

	}

}
