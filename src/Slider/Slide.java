package Slider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slide {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement frame=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		System.out.println("Frame Test Pass");
		
		Actions obj=new Actions(driver);
		
		WebElement slideobj=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		obj.clickAndHold(slideobj).moveByOffset(300, 0).release().build().perform();
		Thread.sleep(1000);
		System.out.println("Slider Test Pass");
		
		driver.quit();
		System.out.println("Program Run Successfully");
		
	}

}
