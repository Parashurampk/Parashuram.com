package Basics;

public class StaticAndNonStaticConcepts {

	String name = "Tom";
	static int age = 25;

	public static void main(String[] args) {
		
		//-----------How to call static methods and var?------------------------
		
		sum();                            //1.direct call by method name 	
		StaticAndNonStaticConcepts.sum(); //2/calssname.method name
		
		System.out.println(age);//var name 
		System.out.println(StaticAndNonStaticConcepts.age);// calssname.var

		
		//-----------How to call Non static methods and var---------------------
		StaticAndNonStaticConcepts obj=new StaticAndNonStaticConcepts();
		obj.sendMail();               //obj.method name
		System.out.println(obj.name); //obj.var name
		
		//Can i access static methods and by using obj reference ? -->Yes
		obj.sum();  //But it will give warning
	}

	public void sendMail() {
		System.out.println("send mail method");
	}

	public static void sum() {
		System.out.println("sum method");
	}
}
