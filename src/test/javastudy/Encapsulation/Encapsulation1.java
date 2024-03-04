package Encapsulation;

public class Encapsulation1 {

	private int length;
	private int width;
	private int height;

	public void setBoxDimension(int length, int width, int height) {

		if (length >= 1 && width >= 1 && height >= 1) {
			System.out.println("Box created with the deminsion" + length + " " + width + " " + height + " ");

		} else {
			System.out.println("Invalid length ");
		}
	}

	public int getLength() {

		return length;
	}

	public int setLength(int length) {

		if (length >= 1) {
			length = 1;
		} else {
			System.out.println("Invalid length ");
		}
		return this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public int setWidth(int width) {
		return this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public int setHeight(int height) {
		return this.height = height;
	}

}
