package DropDownAutomated;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByKeyboard {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement country=driver.findElement(By.xpath("//*[@id=\"autosuggest\"]"));
		country.click();
		country.sendKeys("ind");
		Thread.sleep(1000);
		
		/*country.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		country.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		country.sendKeys(Keys.ENTER);*/
		
		List<WebElement>Drop=driver.findElements(By.xpath("//*[@id=\"ui-id-157\"]"));
		Thread.sleep(1000);
		
		for(int i=0; i<Drop.size(); i++)
			if(Drop.get(i).getText().equalsIgnoreCase("india")) {
				Drop.get(i).click();
			}
		 
		driver.quit();
		System.out.println("Loop Rotated Successfully");
		
	}

}
