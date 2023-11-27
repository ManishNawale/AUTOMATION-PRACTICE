package TestNgPrograms;

import org.testng.annotations.Test;

public class Enable {

	@Test(enabled=true)
	public void Mango() {
		System.out.println("King of all fruit");
	}
	@Test(enabled=false)
	public void  Watermalon() {
		System.out.println("I am biggest");
	}
	@Test()
	public void pineapple() {
		System.out.println("I am very kateri");
	}
	
}
