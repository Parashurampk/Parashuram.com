package Basics;
/* How many ways we can initialize the values to the class variable
 		1-- Using Object
 		2-- Using Constrctor
 		3-- Using Method
 */
public class Employee {
	
	
	int empid;
	String empname;
	int salary;
	int deptno;            // Initialized these values through Object
	
	/*
	Employee(int id, String name, int sal, int deptno)  //parameters 
	{
		empid=id;
		empname=name;
		salary=sal;
		deeptno=deptno;
	}
	*/
	void setdata(int id, String name, int sal, int dno)  
	{
		empid=id;
		empname=name;
		salary=sal;
		deptno=dno;
	}
	
	
	void display() {
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
	}
	
	public static void main(String[] args) {
		
	/*	//1-- Using Object
	   Employee emp1=new Employee();
		emp1.empid=50;
		emp1.empname="Ram";
		emp1.salary=200000;
		emp1.deptno=50;
		emp1.display();
		
		Employee emp2=new Employee();
		emp2.empid=100;
		emp2.empname="Tom";
		emp2.salary=300000;
		emp2.deptno=70;
		emp2.display();
	
		//2-- Using Constrctor
		Employee emp= new Employee(101,"Raj",250000,50); // Constructor will called automatically while creating Objects  
		emp.display();
	*/
		//3-- Using Method
		Employee emp1=new Employee();
		emp1.setdata(101,"Raj", 25852000, 25);
		emp1.display();
	}

}
