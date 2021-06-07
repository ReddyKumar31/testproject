import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.Throw;

public class aits {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kredd\\Desktop\\se drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://aitsrajampet.ac.in/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div[3]/nav/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div[3]/nav/div/ul/li[2]/div/div/div/div/div[2]/ul/li[1]/a")).click();
		 ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	      //switch to new tab
	      driver.switchTo().window(newTb.get(1));
	     //ystem.out.println("Page title of new tab: " + driver.getTitle());
	      driver.findElement(By.xpath("/html/body/section/div/div/div/div/div/div[1]/ul/li[4]/a")).click();
	      driver.findElement(By.xpath("/html/body/section/div/div/div/div/div/div[2]/div/div[4]/table/tbody/tr/td/p[2]/a/font")).click();
	      driver.findElement(By.xpath("/html/body/center/table/tbody/tr[71]/td[2]/span/font[2]/a/font[1]")).click();
	      driver.findElement(By.name("htnumber")).sendKeys("18701D2005");
	      driver.findElement(By.xpath("/html/body/center/table/tbody/tr[7]/td[2]/p[2]/input")).click();
		


	}
	
}
