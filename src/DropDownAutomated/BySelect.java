package DropDownAutomated;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BySelect {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement dropdownButton=driver.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]"));
		//dropdownButton.click();
		
		Select s=new Select(dropdownButton);
		Thread.sleep(1000);
		
		s.selectByIndex(1);
		Thread.sleep(1000);
		
		s.selectByVisibleText("Option2");
		Thread.sleep(1000);
		
		s.selectByValue("option3");
		Thread.sleep(1000);
		
		/*List<WebElement>L=s.getOptions();
		
		for(int i=1; i<L.size(); i++) {
			System.out.println(L.get(i).getText());
		}*/
		
		driver.quit();
		
	}

}
