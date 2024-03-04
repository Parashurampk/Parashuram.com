package JavaLoops;

public class ElseIf {

	public static void main(String[] args) {

		String browser = "Chrome"; 
		
		if (browser.equalsIgnoreCase("Chrome")) {
			System.out.println("Test cases exeuted on chrome");

		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.out.println("Test cases exeuted on firefox");

		} else if (browser.equalsIgnoreCase("IE")) {
			System.out.println("Test cases exeuted on IE");
			
		} else {
			System.out.println("kindly provide valid browser name");
		}
	}
}
