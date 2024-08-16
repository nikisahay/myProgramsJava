package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.LoadableComponent;

public class LoginPage extends LoadableComponent<LoginPage>{
	
	WebDriver ldriver;
	
	By txt_username = By.xpath("//input[@name='username']");
	By txt_password = By.xpath("//input[@name='password']");
	By Login_btn = By.xpath("//input[@value='Login']");
	
	//----Elements for registration-----
	By register_link = By.xpath("//a[text()='Register Now!']");
	By username = By.name("username");
	
	public LoginPage(WebDriver driver) {
		this.ldriver= driver;
		System.out.println("Driver is not null :"+driver.getCurrentUrl());
	}

	public void enterUsername(String username) {
		ldriver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		ldriver.findElement(txt_password).sendKeys(password);
	}
	
	public void clickLogin(){
		ldriver.findElement(Login_btn).click();
	}
	
	public void clickRegister() {
		ldriver.findElement(register_link).click();
	}
	
	public void clickSignOut() {
		
	}
	
	
	@Override
	protected void load() {
		// TODO Auto-generated method stub
		
	}
	
	

	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		
	}

}
