package MultipleOperations1;

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
		
		WebElement rb1=driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/legend"));
		rb1.click();
		Thread.sleep(1000);
		System.out.println(rb1.isDisplayed());
		System.out.println(rb1.isEnabled());
		System.out.println(rb1.isSelected());
		
		System.out.println("\n");
		
		WebElement rb2=driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[2]/input"));
		rb2.click();
		Thread.sleep(1000);
		System.out.println(rb2.isDisplayed());
		System.out.println(rb2.isEnabled());
		System.out.println(rb2.isSelected());
		
		System.out.println("\n");
		
		WebElement rb3=driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[3]/input"));
		rb3.click();
		Thread.sleep(1000);
		System.out.println(rb3.isDisplayed());
		System.out.println(rb3.isEnabled());
		System.out.println(rb3.isSelected());
		
		System.out.println("\n");
		
		driver.quit();
		System.out.println("Successfully Run");

	}

}
