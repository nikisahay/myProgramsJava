package selenium_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class CheckboxSelection {

	public static void main(String[] args) {
	
		        // Set up the WebDriver (Assuming you are using Chrome)
		    System.setProperty("webdriver.gecko.driver","C:\\Project related\\drivers\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		    WebDriver driver = new FirefoxDriver();

		        // Navigate to the webpage with the checkboxes
		        driver.get("https://demo.guru99.com/test"); // Replace with your target URL

		        // Locate all checkboxes within a specified range
		        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@name='bdaytime']"));

		        // Define the range you want to check
		        int startIndex = 0;  // Change to your desired start index (0-based)
		        int endIndex = 5;    // Change to your desired end index (exclusive)

		        // Iterate over the range and check if each checkbox is selected
		        for (int i = startIndex; i < endIndex; i++) {
		            if (checkboxes.get(i).isSelected()) {
		                System.out.println("Checkbox " + i + " is checked.");
		            } else {
		                System.out.println("Checkbox " + i + " is NOT checked.");
		            }
		        }

		        // Close the WebDriver
		        driver.quit();
		    }
		}
