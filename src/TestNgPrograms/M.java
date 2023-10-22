package TestNgPrograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class M {

	@BeforeClass
	public void BC() {
		System.out.println("This code will execute before the calss.");
	}
	
	@AfterClass
	public void AC() {
		System.out.println("This code will execute after the class.");
	}

	@Test
	
	public void name() {
		System.out.println("Hello");
	}
	
}
