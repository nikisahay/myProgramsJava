package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Project related\\drivers\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
		
		//radio button selected
		radio1.click();
		if(radio1.isSelected());
		{
		 System.out.println("Radio Button Option 1 Selected");
		}
		//radio2 button is selected
       radio2.click();
       System.out.println("Radio Button Option 2 Selected");	
       //driver.quit();
       
     //Selecting Checkbox and using isSelected Method		
       driver.get("https://demo.guru99.com/test/facebook.html");					
       WebElement chkFBPersist = driver.findElement(By.xpath("//input[@type='checkbox']"));							
       for (int i=0; i<2; i++) {											
           chkFBPersist.click (); 			
           System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());							
       }		
		driver.close();
	}
}
