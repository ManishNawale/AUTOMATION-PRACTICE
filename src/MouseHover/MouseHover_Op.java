package MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_Op {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		
		Actions M=new Actions(driver);
		Thread.sleep(1000);
		WebElement mouseHover=driver.findElement(By.xpath("//*[@id=\"mousehover\"]"));
		M.moveToElement(mouseHover).build().perform();
		Thread.sleep(1000);
		
		mouseHover.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		mouseHover.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		mouseHover.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		driver.quit();
		
	}

}
