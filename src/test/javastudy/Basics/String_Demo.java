package Basics;

public class String_Demo {
	public static void main(String[] args) {

		// creating string by java string literal
		String str1 = "learn";
		char[] message = { 'b', 'a', 's', 'i', 'c' };

		// creating string by new keyword
		String str2 = new String(message);
		String str3 = new String("java");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		String s1="Automation";
		String s2="Testing";
		
		s1.length(); //1.  length() 
		
        String  s3= s1 +" "+ s2; //2.  Concatenation
        System.out.println(s3);
        
        boolean CompareResult = s1.equals(s2); //3.  equals()
        
        boolean comp_ignore_case = s1.equalsIgnoreCase(s2); //4.  equalsIgnoreCase()
        
        char cIndex = s1.charAt(4); //5.  CharAt()
        
        String lower_case= s1.toLowerCase(); //6.  toLowerCase() 
		
        String upper_case= s1.toUpperCase(); //7.  toUpperCase() 
        
        String message_2 = s1.trim(); //8.   trim()  ,,whitespace omitted.
        
        System.out.println(s1.replace('A','V')); //9.   replace() 
        
        String m = "Learn Basic Java";
        String[] aSplit = m.split("Basic");  //10.  split(String regex)
        System.out.println("The first part of the array is : " + aSplit[0]);
        System.out.println("The last part of the array is : " + aSplit[1]);
        
        String str = "Java";       //11.  startsWith(String prefix)  
        System.out.println("Result is " + str.startsWith("co"));
        
        String mm = "This is an example of a test framework of Selenium";  //12.  indexOf(String str)
        int firstIndex = mm.indexOf("of");
        System.out.println("The start index is : " + firstIndex);
        
        int lastIndex = mm.lastIndexOf("of"); //13.  lastIndexOf(String str)
        
        String sSubString = mm.substring(5, 12); //14. substring()  
        
        boolean containsExample = mm.contains("example"); //15. contains(CharSequense s)
    }
}