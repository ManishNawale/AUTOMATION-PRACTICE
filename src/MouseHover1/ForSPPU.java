package MouseHover1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ForSPPU {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.unipune.ac.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//Creating An object for Actions Class.
		Actions MouseHover=new Actions(driver);
		
		WebElement About=driver.findElement(By.xpath("//*[@id=\"stUI5_txt\"]"));
		Thread.sleep(1000);
		MouseHover.moveToElement(About).build().perform();
		Thread.sleep(1000);
		
		WebElement Acdemics=driver.findElement(By.xpath("//*[@id=\"stUI42_txt\"]"));
		Thread.sleep(1000);
		MouseHover.moveToElement(Acdemics).build().perform();
		Thread.sleep(1000);
		
		WebElement Resarch=driver.findElement(By.xpath("//*[@id=\"stUI184_txt\"]"));
		Thread.sleep(1000);
		MouseHover.moveToElement(Resarch).build().perform();
		Thread.sleep(1000);
		
		WebElement Admistration=driver.findElement(By.xpath("//*[@id=\"stUI194_txt\"]"));
		Thread.sleep(1000);
		MouseHover.moveToElement(Admistration).build().perform();
		Thread.sleep(1000);
		
		WebElement BOD=driver.findElement(By.xpath("//*[@id=\"stUI215_txt\"]"));
		Thread.sleep(1000);
		MouseHover.moveToElement(BOD).build().perform();
		Thread.sleep(1000);
		
		driver.quit();
		
	}

}
