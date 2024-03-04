package TestNgConcept;

import org.testng.annotations.Test;

public class test2 {

	@Test (priority = 1, enabled = false)
	public void Ram() {
		System.out.println("I am Ram");
	}
	
	@Test(priority = 2, dependsOnMethods = "Ram")
	public void Tom() {
		System.out.println("I am Tom");
	}
	
	@Test(priority = 3)
	public void Prabhu() {
		System.out.println("I am Prabhu");
	}
	
}
