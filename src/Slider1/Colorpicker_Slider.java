package Slider1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Colorpicker_Slider {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().window().maximize(); //12to15 for open ##URL automatically.
		Thread.sleep(1000);
		System.out.println("URL Open Successfully.");
		
		WebElement Iframe=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(0); //18to20 for select ##frame automatically. 
		System.out.println("Iframe Test Pass.");
		
		Actions Colorobj=new Actions(driver); //creating object for Action class.
		
		WebElement Red=driver.findElement(By.xpath("//*[@id=\"red\"]/span"));
		Colorobj.clickAndHold(Red).moveByOffset(-100, 0).release().build().perform();
		Thread.sleep(1000); //This is for particular ##Red color picker slider.
		System.out.println("Red Slider Move By -100, 0 Successfully.");
		
		WebElement Green=driver.findElement(By.xpath("//*[@id=\"green\"]/span"));
		Colorobj.clickAndHold(Green).moveByOffset(100, 0).release().build().perform();
		Thread.sleep(1000); //This is for particular ##Green color picker slider.
		System.out.println("Green Slider Move By 100, 0 Successfully.");
		
		WebElement Blue=driver.findElement(By.xpath("//*[@id=\"blue\"]/span"));
		Colorobj.clickAndHold(Blue).moveByOffset(100, 0).release().build().perform();
		Thread.sleep(1000); //This is for particular ##Blue color picker slider.
		System.out.println("Blue Slider Move By 100, 0 Successfully.");
		
		driver.quit();
		System.out.println("Colorpicker Program Run Successfully.");
		
	}

}
