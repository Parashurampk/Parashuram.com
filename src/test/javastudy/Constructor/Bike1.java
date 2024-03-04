package Constructor;

//Java Program to create and call a default constructor
//The default constructor is used to provide the default values to the object like 0, null, etc., 
//depending on the type

class Bike1 {

	Bike1() {                       //creating a default constructor  
		System.out.println("Bike is created");
	}

	public static void main(String args[]) {

		Bike1 b = new Bike1();  //calling a default constructor  
	}
}