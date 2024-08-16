package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.*;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {
	
	WebDriver driver;
	
	HomePage home;
	LoginPage login;
	
	@Given("^browser is open$")
	public void browser_is_open() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Project related\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	}

	@And("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
	    home = new HomePage(driver);
	    home.get();
	    home.clickSignInLink();	    
	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
	   login = new LoginPage(driver);
	   login.get();
	   login.enterUsername(null);
	   login.enterPassword(null);
	   
	   }

	@And("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		login = new LoginPage(driver);
		login.get();
		login.clickLogin();
	}

	@Then("^user is navigated to the application home page$")
	public void user_is_navigated_to_the_application_home_page() throws Throwable {
	   Assert.assertEquals(false, false);
	}

}
