package Multiple_options;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement RadioButton1=driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[1]/input"));
		RadioButton1.click();
		Thread.sleep(1000);
		
		WebElement RadioButton2=driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[2]/input"));
		RadioButton2.click();
		Thread.sleep(1000);
		
		WebElement RadioButton3=driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[3]/input"));
		RadioButton3.click();
		Thread.sleep(1000);
		
		driver.quit();
		
	}

}
