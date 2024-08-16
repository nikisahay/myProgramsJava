package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

public class homePage extends LoadableComponent<homePage>{

	WebDriver LaunchDriver;
	public homePage(WebDriver driver) {
		System.out.println("Driver Object is not null :"+driver.getTitle());
		this.LaunchDriver=driver;
		PageFactory.initElements(LaunchDriver, this);
	}
	
	public void clickEnumerator() {
		
	}
	
	public void clickAdmin() {
		
	}
	
	public void clickViewer() {
		
	}
	
	public void clickSignInButton() {
			
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