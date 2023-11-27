package MultipleOperations1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForCheckBox {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement checkbox1=driver.findElement(By.xpath("//*[@id=\"checkBoxOption1\"]"));
		checkbox1.click();
		System.out.println(checkbox1.isDisplayed());
		System.out.println(checkbox1.isEnabled());
		System.out.println(checkbox1.isSelected());
		
		System.out.println("\n");
		
		WebElement checkbox2=driver.findElement(By.xpath("//*[@id=\"checkBoxOption2\"]"));
		checkbox2.click();
		System.out.println(checkbox2.isDisplayed());
		System.out.println(checkbox2.isEnabled());
		System.out.println(checkbox2.isSelected());
		
		System.out.println("\n");
		
		WebElement checkbox3=driver.findElement(By.xpath("//*[@id=\"checkBoxOption3\"]"));
		checkbox3.click();
		System.out.println(checkbox3.isDisplayed());
		System.out.println(checkbox3.isEnabled());
		System.out.println(checkbox3.isSelected());
		
		driver.quit();
		
	}

}
