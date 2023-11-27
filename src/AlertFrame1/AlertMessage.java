package AlertFrame1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMessage {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		
		WebElement Alert=driver.findElement(By.xpath("//*[@id=\"alertbtn\"]"));
		Alert.click();
		Thread.sleep(1000);
		
		//driver.switchTo().alert().accept();
		//System.out.println(driver.switchTo().alert().getText());
		
		String alertmessage=driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		
		Thread.sleep(1000);
		
		driver.switchTo().alert().dismiss();
		
		driver.quit();
		
	}

}
