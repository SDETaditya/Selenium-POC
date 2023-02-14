package testproj.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import testproj.pageobjects.LoginPage;

public class TC001_LoginTest extends BaseClass{
	@Test
	public void loginTest() {

		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
	
		lp.setPassword(password);
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			
			Assert.assertTrue(false);
		}
		
	
	}
}
