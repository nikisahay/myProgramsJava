package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver","C:\\Project related\\drivers\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();      
      driver.get("https://www.google.com");
       driver.getTitle();
       
       
       System.out.println(driver.getCurrentUrl());
       
       //System.out.println(driver.getPageSource());
       driver.get("http://yahoo.com");
       System.out.println(driver.getTitle());
       driver.navigate().back();
       driver.close();
       driver.quit();
	}

}
