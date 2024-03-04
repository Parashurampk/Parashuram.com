package TestNgConcept;

import org.testng.annotations.Test;

public class test1 {

	    @Test
	//  @Test(description="This is testcase1") 
	//  @Test(dependsOnMethods= {"WebStudentLogin"}) 
	// @Test(dependsOnMethods= {"testcase3","testcase2"})  
	// @Test(enabled=false)  
	// @Test(groups= {"software company"})  
	// @Test(timeOut=200)  
	    public void SBI()  
	    {  
	        System.out.println("Hello  i am SBI");  
	    }  
	      
	    @Test  
	    public void ICICI()  
	    {  
	        System.out.println("Hello I am ICICI");  
	    } 

	}

