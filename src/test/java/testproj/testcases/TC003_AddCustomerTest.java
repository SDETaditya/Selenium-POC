package testproj.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import testproj.pageobjects.AddCustomerPage;
import testproj.pageobjects.LoginPage;


public class TC003_AddCustomerTest extends BaseClass
{

	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddCustomerPage addcust=new AddCustomerPage(driver);
		
		addcust.clickAddNewCustomer();
		
		logger.info("providing customer details....");
		
		
		addcust.custName("Aditya");
		addcust.custgender("male");
		addcust.custdob("01","01","2023");
		Thread.sleep(5000);
		addcust.custaddress("CAN");
		addcust.custcity("KWC");
		addcust.custstate("ON");
		addcust.custpinno("5000074");
		addcust.custtelephoneno("123456789");
		
		String email=randomestring()+"@gmail.com";
		addcust.custemailid(email);
		addcust.custpassword("abcdef");
		addcust.custsubmit();
		
		Thread.sleep(3000);
		
		logger.info("validation started....");
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("test case passed....");
			
		}
		else
		{
			logger.info("test case failed....");
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
			
	}
	
	
}
