package FinalAndFinally;

public class WrapperClassConcepts {

	public static void main(String[] args) {

		String x = "100";
		System.out.println(x + 20); //10020
		
		//data conversion: String to int:
		int i = Integer.parseInt(x);
		System.out.println(i+20); //120
		
		//String to double
		String y="12.33";
		double d=Double.parseDouble(y);
		System.out.println(d+10);
		
		//String to boolean:
		 String k="true";
		 boolean b=Boolean.parseBoolean(k);
		 System.out.println(b);
		 
		 //int to String
		 int j=200;
		 System.out.println(j+20);
		 String s=String.valueOf(j);//200
		 System.out.println(s+20);//20020
		 
		 String u="100A0";
		 Integer.parseInt(u);//NumberFormatException--for input string:"100A"
	}

}
