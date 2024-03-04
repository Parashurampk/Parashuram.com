package FinalAndFinally;

public class Finallize {
	
	public void finalize() {
		System.out.println("Finallize method");
	}

	public static void main(String[] args) {
		
		Finallize f1=new Finallize();
		Finallize f2=new Finallize();
		
		f1=null;
		f2=null;
		
		System.gc();//before System.gc Finalize method will call to clean up processing
		
	}

}
















