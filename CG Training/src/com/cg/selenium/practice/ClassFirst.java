package com.cg.selenium.practice;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver; 

public class ClassFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Project related\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[contains(@aria-label,'Search')]")).sendKeys("javatpoint-tutorials");
		
		driver.findElement(By.name("btnk")).click();

	}

}
