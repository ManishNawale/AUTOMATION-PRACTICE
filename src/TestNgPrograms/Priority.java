package TestNgPrograms;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority=3)
	public void Closebrowser() {
		System.out.println("close the browser asap.");
	}
	
	@Test(priority=2)
	public void LaunchURL() {
		System.out.println("launch web page.");
	}
	
	@Test(priority=1)
	public void startbrowser() {
		System.out.println("start browser.");
	}
	
}
