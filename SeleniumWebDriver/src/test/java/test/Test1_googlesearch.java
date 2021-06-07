package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_googlesearch {

	public static void main(String[] args) {
		
		googleSearch();
		
	}
	
	public static void googleSearch() {
		
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//go to google.com
		driver.get("https://google.com/");
		
		//Enter data in search
		driver.findElement(By.id("input")).sendKeys("automation");
		
		//click on search
		
		driver.findElement(By.xpath("/html/body/ntp-app//div[1]/ntp-realbox//div/button")).click();
		
		//use to click enter button on keyboard
		driver.findElement(By.xpath("/html/body/ntp-app//div[1]/ntp-realbox//div/button")).sendKeys(Keys.RETURN);
		
		//close browser
		driver.close();
		
		System.out.println("test completed");
		
		
		
		
	}
	
	
}
