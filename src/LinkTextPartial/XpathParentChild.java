package LinkTextPartial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathParentChild {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement Remember=driver.findElement(By.xpath("//div[@class=\'w0 pr ln3 p16 remember\']/input"));
		Thread.sleep(1000);
		Remember.click();
		
		driver.quit();
		
	}

}
