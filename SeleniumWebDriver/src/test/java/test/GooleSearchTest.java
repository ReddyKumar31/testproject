package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchobject;

	
public class GooleSearchTest {
	private static WebDriver driver = null;
	public static void main(String[] args) {
		googleSearchTest();
	}
	public static void googleSearchTest() {
		
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		GoogleSearchobject searchPageobj = new GoogleSearchobject(driver);
		
		driver.get("https://google.com");
		
		searchPageobj.setTextInsearchBox("a b c d");
		
		searchPageobj.clickSearchButton();
		
		driver.close();
		
	}
	
	
	

}
