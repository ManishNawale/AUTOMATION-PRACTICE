package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement un=driver.findElement(By.id("username"));//locate on user name text field.
		un.click();
		un.sendKeys("manishnawale.msn@gmail.com");
		Thread.sleep(1000);
		
		WebElement pw=driver.findElement(By.name("pw"));
		pw.click();
		pw.sendKeys("M@0000");
		Thread.sleep(1000);
		
		WebElement login=driver.findElement(By.name("Login"));
		login.click();
		
		driver.quit();
		
	}

}
