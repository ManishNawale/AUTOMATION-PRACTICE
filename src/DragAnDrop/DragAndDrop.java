package DragAnDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement Washington=driver.findElement(By.xpath("//*[@id=\"box3\"]"));
		WebElement UnitedStates=driver.findElement(By.xpath("//*[@id=\"box103\"]"));
		Thread.sleep(1000);
		
		WebElement Oslo=driver.findElement(By.xpath("//*[@id=\"box1\"]"));
		WebElement Norway=driver.findElement(By.xpath("//*[@id=\"box101\"]"));
		Thread.sleep(1000);
		
		WebElement Stockholm=driver.findElement(By.xpath("//*[@id=\"box2\"]"));
		WebElement Swedan=driver.findElement(By.xpath("//*[@id=\"box102\"]"));
		Thread.sleep(1000);
		
		WebElement Seoul=driver.findElement(By.xpath("//*[@id=\"box5\"]"));
		WebElement southKorea=driver.findElement(By.xpath("//*[@id=\"box105\"]"));
		Thread.sleep(1000);
		
		WebElement Rome=driver.findElement(By.xpath("//*[@id=\"box6\"]"));
		WebElement Italy=driver.findElement(By.xpath("//*[@id=\"box106\"]"));
		Thread.sleep(1000);
		
		WebElement Copehhagen=driver.findElement(By.xpath("//*[@id=\"box4\"]"));
		WebElement Denmark=driver.findElement(By.xpath("//*[@id=\"box104\"]"));
		Thread.sleep(1000);
		
		WebElement Madrid=driver.findElement(By.xpath("//*[@id=\"box7\"]"));
		WebElement Spain=driver.findElement(By.xpath("//*[@id=\"box107\"]"));
		Thread.sleep(1000);
		
		Actions Country_Capital=new Actions(driver);
		
		Country_Capital.dragAndDrop(Washington, UnitedStates).build().perform();
		Thread.sleep(1000);
		Country_Capital.dragAndDrop(Oslo, Norway).build().perform();
		Thread.sleep(1000);
		Country_Capital.dragAndDrop(Stockholm, Swedan).build().perform();
		Thread.sleep(1000);
		Country_Capital.dragAndDrop(Seoul, southKorea).build().perform();
		Thread.sleep(1000);
		Country_Capital.dragAndDrop(Rome, Italy).build().perform();
		Thread.sleep(1000);
		Country_Capital.dragAndDrop(Copehhagen, Denmark).build().perform();
		Thread.sleep(1000);
		Country_Capital.dragAndDrop(Madrid, Spain).build().perform();
		Thread.sleep(1000);
		
		driver.quit();
		
	}

}
