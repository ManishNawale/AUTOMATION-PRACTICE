package Xpath_CSS;

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
		System.out.println("Open URL successfully.");
		
		WebElement Username=driver.findElement(By.xpath("//*[@id=\"username\"]"));
		Username.click();
		Username.sendKeys("manishnawale.msn@gmail.com");
		System.out.println("Click on username successfully.");
		
		WebElement Password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Password.click();
		Password.sendKeys("M@0000");
		System.out.println("Click on password successfully.");
		
		WebElement Login=driver.findElement(By.cssSelector("input[class='button r4 wide primary']"));
		Login.click();
		Thread.sleep(1000);
		System.out.println("Click On Login successfully.");
		
		driver.close();
		System.out.println("Program Run successfully.");
		
	}

}
