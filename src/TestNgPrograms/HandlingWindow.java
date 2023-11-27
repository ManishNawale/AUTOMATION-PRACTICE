package TestNgPrograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingWindow {

	@Test
	public void open() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"openwindow\"]")).click();
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());//to print current URL on console.
		Thread.sleep(1000);
		
		//creating array list to handle windows.
		Set<String> A=driver.getWindowHandles();
		
		Iterator<String> NW=A.iterator();
		String parent_Window=NW.next();
		String child_Window=NW.next();
		Thread.sleep(1000);
		
		driver.switchTo().window(child_Window);
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//*[@id=\"header-part\"]/div[2]/div/div/div[2]/div/div[2]/a")).click();
		Thread.sleep(1000);
		
		driver.switchTo().window(parent_Window);
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
	}
	
}
