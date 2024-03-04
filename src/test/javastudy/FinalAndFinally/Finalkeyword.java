package FinalAndFinally;

public class Finalkeyword {

	final int speedlimit = 90;// final variable

	public void run() {
		// speedlimit = 400;
		System.out.println(speedlimit);
	}

	public static void main(String args[]) {
		Finalkeyword obj = new Finalkeyword();
		obj.run();
	}

}

//final keyword: once assigned a value can not be changed
//final Method : If you make any method as final, you cannot override it.
//final class  : If you make any class as final, you cannot extend it
