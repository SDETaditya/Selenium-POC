package testproj.utilities;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigurations {
	Properties prop;
	public ReadConfigurations()  {
	
		try {

			FileInputStream fis = new FileInputStream(".\\Configurations\\config.properties");
			prop = new Properties();
			try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public String getBaseURL() {
		String url = prop.getProperty("baseURL");
		return url;
				}
	public String getUsername() {
		String uname = prop.getProperty("username");
		return uname;
				}
	public String getPassword() {
		String pwd = prop.getProperty("password");
		return pwd;
				}

}
