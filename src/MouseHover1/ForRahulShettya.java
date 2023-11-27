package MouseHover1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ForRahulShettya {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//Create object on Action Class.
		Actions m=new Actions(driver);
		
		WebElement MouseHover=driver.findElement(By.xpath("//*[@id=\"mousehover\"]"));
		Thread.sleep(1000);
		
		//To MouseHover.
		m.moveToElement(MouseHover).build().perform();
		Thread.sleep(1000);
		
		driver.quit();
		
	}

}
