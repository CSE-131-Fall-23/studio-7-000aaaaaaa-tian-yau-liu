package studio7;

public class Complex {
	private static double imaginary;
	private static double real;
	
	public Complex(double iImaginary, double iReal) {
		this.imaginary = iImaginary;
		this.real = iReal;
	}
	
	public Complex sum(double bImaginary, double bReal) {
		Complex temp = new Complex (imaginary + bImaginary, real + bReal);
		return temp;
	}
	
	public Complex product(double d, double c) {
		Complex temp = new Complex (real*c - imaginary * d, real*d + imaginary*c);
		return temp;
	}
	
	
}
