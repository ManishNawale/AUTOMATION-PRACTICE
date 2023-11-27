package MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_SPPU {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("http://www.unipune.ac.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		Actions a=new Actions(driver); //Creating object for actions class.
		
		WebElement AboutTheuni=driver.findElement(By.xpath("//*[@id=\"stUI5_txt\"]"));
		Thread.sleep(1000);
		a.moveToElement(AboutTheuni).build().perform();
		Thread.sleep(1000);
		
		WebElement Acadmics=driver.findElement(By.xpath("//*[@id=\"stUI42_txt\"]"));
		Thread.sleep(1000);
		a.moveToElement(Acadmics).build().perform();
		Thread.sleep(1000);
		
		WebElement Resarch=driver.findElement(By.xpath("//*[@id=\"stUI184_txt\"]"));
		Thread.sleep(1000);
		a.moveToElement(Resarch).build().perform();
		Thread.sleep(1000);
		
		WebElement UsefullLinks=driver.findElement(By.xpath("//*[@id=\"stUI253_txt\"]"));
		Thread.sleep(1000);
		a.moveToElement(UsefullLinks).build().perform();
		Thread.sleep(1000);
		
		driver.quit();
		
	}

}
