package OptionDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownLocator {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement Select=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select.click();
		
		WebElement option1=driver.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]/option[2]"));
		option1.click();
		Thread.sleep(1000);
		WebElement option2=driver.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]/option[3]"));
		option2.click();
		Thread.sleep(1000);
		WebElement option3=driver.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]/option[4]"));
		option3.click();
		
		driver.quit();
		System.out.println("Bari Nit aai ghatli zhal run program");
		
	}

}
