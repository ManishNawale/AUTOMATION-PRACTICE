package ForAndForEach;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForRadioButton {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		List<WebElement>m=driver.findElements(By.xpath("//input[@name='radioButton']"));
		
		for(int i=0; i<m.size(); i++) {
			m.get(i).click();
			Thread.sleep(1000);
		}
		for(WebElement n:m) {
			n.click();
			Thread.sleep(1000);
		}
		
		driver.quit();
		
	}

}
