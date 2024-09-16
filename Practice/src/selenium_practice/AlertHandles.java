package selenium_practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertHandles {

	public static void main(String[] args) throws NoAlertPresentException,InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Project related\\drivers\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// Alert Message handling
		
        driver.get("https://demo.guru99.com/test/delete_customer.php");			
                            		
     	      	
        driver.findElement(By.name("cusid")).sendKeys("53920");					
        driver.findElement(By.name("submit")).submit();			
        		
        // Switching to Alert        
        Alert alert = driver.switchTo().alert();		
        Thread.sleep(1000);
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        Thread.sleep(5000);
        		
        // Accepting alert		
        alert.accept();	
        driver.close();
        
        
	}
}
