package Arrays;

public class ArrayConcepts {

	public static void main(String[] args) {
		
		//array: to store similar kind of data type values in a array variable 
		
		//lowest index =0
		//size=n-1
		
		//Disadvantages
		//1.size is fixed--static array--To overcome of this this problem-- we use Collection--ArrayList,
		//2.store only similar data types--To over of this problems, we use Object array
		
		//Integer array
		
		
/*
 JVM (Java Virtual Machine) is an abstract machine that enables your computer to run a Java program.

 When you run the Java program, Java compiler first compiles your Java code to bytecode. Then, the JVM translates bytecode into 
 native machine code (set of instructions that a computer's CPU executes directly).

 Java is a platform-independent language. It's because when you write Java code, it's ultimately written for JVM but not your
 physical machine (computer). Since JVM ​executes the Java bytecode which is platform-independent, Java is platform-independent.
*/
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[2]);
		
		//To print all the array values
		for(int j=0;j<i.length;j++) {   //0<4=10,1<4=20...
			System.out.println(i[j]);
		}
		
		//double array
		double d[]=new double[3];
		d[0]=12.5;
		d[1]=20.5;
		d[2]=30.5;
		System.out.println(d[2]);
		
		//char array
		char c[]=new char[3];
		c[0]='q';
		c[1]='2';
		c[2]='#';
		
		System.out.println(c[2]);
		
		//boolean array
		boolean b[]=new boolean[2];
		b[0]=true;
		b[1]=false;
		
		System.out.println(b[1]);
		
		//String array
		String s[]=new String[2];
		s[0]="test";
		s[1]="Hello";
		System.out.println(s.length);
		
		
		//Object array
		Object ob[]=new Object[4]; // used to store diff data types value
		ob[0]="Tom";
		ob[1]="25";
		ob[2]="50.5";
		ob[3]="London";
		System.out.println(ob[3]);
		System.out.println(ob.length);
		
		for(int j=0;j<ob.length;j++) {
			System.out.println(ob[j]);
		}
		
		
	}

}
