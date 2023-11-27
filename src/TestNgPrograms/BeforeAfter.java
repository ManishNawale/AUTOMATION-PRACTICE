package TestNgPrograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeAfter {

	@BeforeClass
	public void M() {
		System.out.println("This code is execute before class.");
	}
	
	@AfterClass
	public void S() {
		System.out.println("This code is execute after class.");
	}
	
	@Test
	public void N() {
		System.out.println("Hello");
	}
	
}
