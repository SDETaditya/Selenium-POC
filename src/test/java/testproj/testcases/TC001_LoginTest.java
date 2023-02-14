package testproj.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import testproj.pageobjects.LoginPage;

public class TC001_LoginTest extends BaseClass{
	@Test
	public void loginTest() {

		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("entering username");
	
		lp.setPassword(password);
		logger.info("entering password");
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("login test passed");
		}
		else
		{
			
			Assert.assertTrue(false);
			logger.info("login test failed");
		}
		
	
	}
}
