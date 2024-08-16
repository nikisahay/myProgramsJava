package selenium_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class CheckboxSelection {

	public static void main(String[] args) {
	
		        // Set up the WebDriver (Assuming you are using Chrome)
		        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
		        WebDriver driver = new ChromeDriver();

		        // Navigate to the webpage with the checkboxes
		        driver.get("http://example.com"); // Replace with your target URL

		        // Locate all checkboxes within a specified range
		        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

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
