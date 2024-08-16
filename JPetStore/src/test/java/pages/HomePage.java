package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.LoadableComponent;

public class HomePage extends LoadableComponent<HomePage>{
	
	WebDriver ldriver;
	
	
	By SignInlink = By.xpath("//a[text()='Sign In']");
	By Search_btn = By.name("searchProducts");
	By Bird_link = By.xpath("//map/area[contains(@alt,'Birds')]");
	
	public HomePage(WebDriver driver) {
		this.ldriver= driver;
		System.out.println("Driver is not null :"+driver.getTitle());
	}
	
	public void clickSignInLink() {
		ldriver.findElement(SignInlink).click();
		
	}
	
	public void clickOnFish() {
		
	}
    
	 public void clickOnDogs() {
		
	 }
	 
	 public void clickOnCats() {
		 
	 }
	 
	 public void clickOnReptiles() {
		 
	 }
	 
	 public void clickOnBirds() {
		 ldriver.findElement(Bird_link).click();
	 }
	 
	 public void clickOnCart() {
		 
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
