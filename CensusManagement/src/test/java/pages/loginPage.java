package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;


public class loginPage extends LoadableComponent<loginPage>{

	WebDriver ldriver;
	//By txt_username = By.;
    //By txt_password = By;
    //By btn_login = By;
	
	public loginPage(WebDriver driver) {
		System.out.println("Driver object is not null :"+driver.getTitle());
		this.ldriver=driver;
		PageFactory.initElements(ldriver, this);
	}
	
	public void typeEmail() {
		
	}
	
	public void typePassword() {
		
	}
	
	public void clickLogin() {
		
	}
	
	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void load() {
		// TODO Auto-generated method stub
		
	}
	

    

}