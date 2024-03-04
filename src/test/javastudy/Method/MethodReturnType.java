package Method;

public class MethodReturnType {
	// methods/functions :-some logic written in a block
	// You can call this block
	// static and non-static method

	// can not create method inside a method
	// but you can call the methods from diff methods
	// duplicate methods are not allowed
	// but we can overload the methods
	// main is also method and it is static
	// methods should be parallel(means independent) to each other
	// to call the non-static methods --> we have to create the object of the class
	// function can not return multiple value
	// can return only one value at a time

	public static void main(String[] args) {
		MethodReturnType m = new MethodReturnType();
		m.test();
		int c = m.sum();
		System.out.println(c);

		m.getTrainerName();// 1--> always use this one , bcaz of code reusibility /means we can use this s

		String s = m.getTrainerName();// string for other functionality like append
		System.out.println(s);
		System.out.println(s + " from naveen auto labs");// i.e use this one

		System.out.println(m.getTrainerName());

		int s2 = m.add(10, 50);
		System.out.println(s2);
	}

	// 1.no input and no return;
	// void in nature--> can not return anything(no return keyword)
	public void test() {
		System.out.println("test method");
	}

	// 2. no input but some return:
	// return type : integer
	public int sum() {
		System.out.println("Sum method");
		int a = 10;
		int b = 20;
		int z = a + b;
		return z;
	}

	public String getTrainerName() {
		System.out.println("get trainer name");
		String name = "Naveen";
		return name;
	}

	// 3. some input and some return
	public int add(int a, int b) {
		System.out.println("add method");
		int sum = a + b;
		return sum;// return should be last statement of the method

	}

}
