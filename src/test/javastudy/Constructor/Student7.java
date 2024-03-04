package Constructor;
//We can copy the values of one object into another by assigning the objects values to another object.
//In this case, there is no need to create the constructor.

public class Student7 {
	int id;
	String name;

	Student7(int i, String n) {
		id = i;
		name = n;
	}

	Student7() {
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		Student7 s1 = new Student7(111, "Karan");
		Student7 s2 = new Student7();
		s2.id = s1.id;
		s2.name = s1.name;
		s1.display();
		s2.display();
	}
}