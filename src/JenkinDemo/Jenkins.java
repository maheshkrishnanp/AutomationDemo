package JenkinDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Jenkins {
	
	
	@Test
	public void testLogin() throws Exception {
		// TODO Auto-generated method stub
     
		System.out.println("This is a test program");
		
		System.setProperty("webdriver.chrome.driver", "C://SeleniumDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app-nodejs-mahesh.mybluemix.net/");
		String title = driver.getTitle();
		driver.close();
		
		System.out.println(title);
		
		Assert.assertTrue(title.equals("Hello World..."));
		

	}
	
}
