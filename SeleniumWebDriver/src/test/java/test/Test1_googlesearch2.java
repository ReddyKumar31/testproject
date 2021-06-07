package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;

public class Test1_googlesearch2 {

	private static WebDriver driver=null;
	
	public static void main(String[] args) {
		
		googleSearch();
		
	}
	
	public static void googleSearch() {
		
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		//go to google.com
		driver.get("https://google.com/");
		
		//Enter data in search
		//driver.findElement(By.id("input")).sendKeys("automation");
		GoogleSearchPage.textbox_search(driver).sendKeys("automation");
		
		//click on search
		driver.findElement(By.xpath("/html/body/ntp-app//div[1]/ntp-realbox//div/button")).click();
		
		//use to click enter button on keyboard
		//driver.findElement(By.xpath("/html/body/ntp-app//div[1]/ntp-realbox//div/button")).sendKeys(Keys.RETURN);
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		
		//close browser
		
		driver.close();
		
		System.out.println("test completed");
		
		
		
		
	}
	
	
}
