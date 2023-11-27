package TestNgPrograms;

import org.testng.annotations.Test;

public class TP_Byletter {

	@Test(priority='x')
	public void aeroplane() {
		System.out.println("I am above clouds");
	}
	@Test(priority='D')
	public void Ship() {
		System.out.println("I am in water");
	}
	@Test(priority='c')
	public void Bus() {
		System.out.println("I am always on road.");
	}
	
}
