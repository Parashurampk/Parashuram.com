package TestNGConcepts;

import org.testng.annotations.Test;

public class TN8_TestNGPriorityAnnotationss {
	
	@Test(priority = 4)
	public void b_method() {
		System.out.println("Its me method B");
	}

	@Test(priority = 0)
	public void c_method() {
		System.out.println("Its me method C");
	}

	@Test(priority = 3)
	public void d_method() {
		System.out.println("Its me method D");
	}

	@Test(priority = 1)
	public void a_method() {
		System.out.println("Its me method A");
	}

	@Test(priority = 6)
	public void e_method() {
		System.out.println("Its me method E");
	}
}