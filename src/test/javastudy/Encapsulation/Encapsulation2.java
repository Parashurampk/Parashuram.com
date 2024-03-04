package Encapsulation;

public class Encapsulation2 {

	public static void main(String[] args) {
		Encapsulation1 encap=new Encapsulation1();
		
		int length=encap.setLength(-10);
		int width=encap.setWidth(20);
		int height=encap.setHeight(30);
		encap.setBoxDimension(-10, 20, 30);

		System.out.println(encap.getLength());
		System.out.println(encap.getWidth());
		System.out.println(encap.getHeight());
	}

}
