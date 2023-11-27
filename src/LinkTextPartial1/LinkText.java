package LinkTextPartial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement Link=driver.findElement(By.linkText("Forgot Your Password?"));
		Thread.sleep(1000);
		
		System.out.println(Link.isDisplayed());
		System.out.println(Link.isEnabled());
		System.out.println(Link.isSelected());
		Thread.sleep(1000);
		
		System.out.println("\n");
		
		WebElement remember=driver.findElement(By.xpath("//*[@id=\"rememberUn\"]"));
		remember.click();
		System.out.println(remember.isEnabled());//made enabled method true(bcoz of clicking on checkbox.
		//Link.click();
		Thread.sleep(1000);
		
		System.out.println("\n");
		
		WebElement Custom=driver.findElement(By.partialLinkText("Use Custom"));
		System.out.println(Custom.isDisplayed());
		System.out.println(Custom.isEnabled());
		System.out.println(Custom.isSelected());
		Custom.click();
		
		driver.quit();
		
	}

}
