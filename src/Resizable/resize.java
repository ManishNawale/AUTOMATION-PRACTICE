package Resizable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class resize {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement Iframe=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")); //for frame.
		driver.switchTo().frame(Iframe);
		
		WebElement Resize=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		
		Actions obj=new Actions(driver);
		
		obj.dragAndDropBy(Resize, 302, 207).perform();//here we have to put x -axis and y-axis values.
		
		driver.quit();
		System.out.println("Run successfully.");
		
	}

}
