package Xpath_CSS1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocators {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement username=driver.findElement(By.xpath("//*[@id=\"username\"]"));
		username.click();
		username.sendKeys("manishnawale.msn@gmail.com");
		Thread.sleep(1000);
		
		WebElement password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.click();
		password.sendKeys("Manish@000");
		Thread.sleep(1000); 
		
		WebElement login=driver.findElement(By.cssSelector("input[class='button r4 wide primary']"));
		login.click();
		
		driver.quit();
		
	}

}
