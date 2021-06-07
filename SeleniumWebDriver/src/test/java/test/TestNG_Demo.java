package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo {

	static WebDriver driver = null;
	@BeforeTest
	public void setUpTest() {
		
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	
	public static void googleSearch() {
		
		//go to google.com
		driver.get("https://www.amazon.in/");
		
		//Enter data in search
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("ipad");
		
		//click on search
		
		//driver.findElement(By.xpath("/html/body/ntp-app//div[1]/ntp-realbox//div/button")).click();
		
		//use to click enter button on keyboard
		driver.findElement(By.id("nav-search-submit-button")).sendKeys(Keys.RETURN);
		
		
		
		System.out.println("test completed");
		
		
	}
	@AfterTest
	
	public void tearDownTest() {
		
		//close browser
		driver.close();
	}
	
	
}
