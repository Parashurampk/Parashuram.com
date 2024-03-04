package Method;

//Class level --> public and default 
//Variable and Method level --> all 4

public class Modifiers {

	public int publicvariable = 1;
	int defultvariable = 2;
	protected int protectedVarible = 4;
	private int privateVaraible = 3;

	public static void main(String[] args) {

		Modifiers modifiers = new Modifiers();
		System.out.println(modifiers.publicvariable);
		System.out.println(modifiers.defultvariable);
		System.out.println(modifiers.protectedVarible);
		System.out.println(modifiers.privateVaraible);

	}

	public void publicMethod() {

	}

	void defultMethod() {

	}

	protected void protectedMethod() {

	}
	
	private void privateMethod() {
		
	}
}
