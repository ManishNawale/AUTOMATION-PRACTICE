package TestNgPrograms;

import org.testng.annotations.Test;

public class DependsOn {

	@Test(dependsOnMethods = "Rocketry")
	public void ImmitationGame() {
		System.out.println("Allen Turing");
	}
	
	@Test
	public void AbeautifulMind() {
		System.out.println("John Nash");
	}
	
	@Test
	public void Rocketary() {
		System.out.println("The Numby Narayanan.");
	}
	
}
