package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.LoadableComponent;

public class RegistrationPage extends LoadableComponent<RegistrationPage> {
	
	WebDriver ldriver;
	
	public RegistrationPage(WebDriver driver) {
		this.ldriver= driver;
		System.out.println("Driver is not null :"+driver.getCurrentUrl());
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
