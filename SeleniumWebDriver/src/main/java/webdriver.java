import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webdriver {
	
	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.amazon.in/");
        //WebElement textBox=driver.findElement(By.id("input"));
        //textBox.sendKeys("google");
        
        //creating own xpath: "//input[@class='read']"
        List<WebElement> listOfInputElements=driver.findElements(By.id("//input"));
        int count = listOfInputElements.size();
        System.out.println("conut of input elemnts : "+count);
        
        
        Thread.sleep(3000); 
		driver.close();
		

	}
	
	
}
