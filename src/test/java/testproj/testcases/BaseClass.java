package testproj.testcases;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class BaseClass {

	
	public String baseURL="https://demo.guru99.com/v3/index.php";
	public String username="mngr475355";
	public String password="Usabamu";
	public WebDriver driver;
	public Logger logger ;
	
	@BeforeClass
	public void setup()
	{		
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
			driver=new ChromeDriver();
			logger = Logger.getLogger("guru99");
			PropertyConfigurator.configure("log4j.properties");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(baseURL);
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	


}
