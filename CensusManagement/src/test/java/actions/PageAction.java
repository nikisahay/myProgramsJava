package actions;

import pages.homePage;
import pages.loginPage;

public class PageAction extends BaseAction{
	homePage home;
	loginPage login;

	public void SignIn(String userName,String Password) {
		System.out.println("initializedriver :"+initializedriver.getCurrentUrl());
		
	}
	
	public void clickSignOut()
	{
		
	}
}

