package simpleAutomationProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manish {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.youtube.com/"); //For link paste.
		Thread.sleep(1000);
		
		driver.manage().window().maximize();//For maximize the window.
		Thread.sleep(1000);
		
		System.out.println(driver.getCurrentUrl());//It means system print the provide link.
		System.out.println(driver.getTitle()); //It means system print the link title.
		
		driver.quit();//For close the browser.

	}

}
