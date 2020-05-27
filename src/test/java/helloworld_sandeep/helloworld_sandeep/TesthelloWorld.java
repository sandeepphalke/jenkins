package helloworld_sandeep.helloworld_sandeep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TesthelloWorld {
	
	
	
//	@BeforeClass
//	public void preConditions()
//	{
//		System.out.println("<<-------------------------------RUN STARTED------------------------------->>");
//		System.out.println("  ");
//	}
	
	@Test
	public void testHelloWorld() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "W:\\Drivers\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		System.out.println("The URL is : " + driver.getCurrentUrl());
		Thread.sleep(10000);	
	}
	
//	@AfterClass
//	public void postConditions()
//	{
//		driver.close();	
//		System.out.println("  ");
//		System.out.println("<<-------------------------------RUN ENDED------------------------------->>");
//	}

}
