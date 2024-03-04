package Constructor;
    //Constructor name should be same as class name 
	//Not have return type 
	//Always non static
public class Constructor1 {

		Constructor1() {        //Constructor
			System.out.println("Constructor called");  
		}

		public void add() {      //Method
			System.out.println("adding 2 numbers");
		}
		
		public static void main(String[] args) {
			Constructor1 obj=new Constructor1();    // when object created Constructor will call automatically
			obj.add();                            // calling the method 
		}
	}

