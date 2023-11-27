package ForAndForEach;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForLoop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		List<WebElement>m=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(int i=0; i<m.size(); i++) { //This is for select the multiple options.
			m.get(i).click();
		}
		
		Thread.sleep(1000);
		
		for(WebElement N:m) { //This is for unselect the multiple options.
			N.click();
		}
		
		driver.quit();
		
	}

}
