package DragAnDrop1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragManish {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//Here the drag and drop option in frames so we have take path of that and then switch to frame.
		driver.switchTo().frame(0);
		
		//Path of Drag.
		WebElement source=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		Thread.sleep(1000);
		
		//Path of Drop.
		WebElement Target=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Thread.sleep(1000);
		
		//We have to create object for actions class to perform actions.
		
		Actions obj=new Actions(driver);
		
		//1st method to drag and drop.
		obj.clickAndHold(source).build().perform();
		obj.moveToElement(Target).build().perform();
		obj.release().build().perform();
		Thread.sleep(1000);
		
		//2nd method.
		//obj.clickAndHold(source).moveToElement(Target).build().perform();
		
		//3rd method.
		//obj.dragAndDrop(source, Target).build().perform();
		
		driver.quit();
	}

}
