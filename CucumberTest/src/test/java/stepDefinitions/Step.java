package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step {
	WebDriver driver;
	@Given("^Open the firefox and start application$")
	public void open_the_firefox_and_start_application() throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Project related\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://login.yahoo.com/");
	}
	 
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
	driver.findElement(By.id("login-username")).sendKeys("nikisahay27");
	driver.findElement(By.name("signin")).click();
	driver.findElement(By.id("login-passwd")).sendKeys("Krishna11$");
	}
	
	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
	driver.findElement(By.id("login-signin")).click();
	}
}
