package studio7;

public class Rectangle {
	private static int length;
	private static int width;
	
	public Rectangle (int iLength, int iWidth) {
		this.length = iLength;
		this.width = iWidth;
	}
	
	public static int getLength() {
		return length;
	}
	
	public static int getWidth() {
		return width;
	}

	public static double getArea() {
		return width*length;
	}
	
	public static int getPerimeter() {
		return 2 * (width + length);
	}
	
	public static boolean isSmaller(double area) {

		if (Rectangle.getArea() < area) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isSquare() {
		if (width == length) {
			return true;
		} else {
			return false;
		}
	}
	
}
