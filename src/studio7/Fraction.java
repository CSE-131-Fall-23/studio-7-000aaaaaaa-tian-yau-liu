package studio7;

public class Fraction {
	
	private static int numerator;
	private static int denominator;
	
	public Fraction () {
		this.numerator = 1;
		this.denominator = 1;
	}
	
	public Fraction (int iNumerator, int iDenominator) {
		this.numerator = iNumerator;
		this.denominator = iDenominator;
	}
	
	public static int getNumerator() {
		return numerator;
	}
	
	public static int getDenominator() {
		return denominator;
	}

	public Fraction sum(int bNumerator, int bDenominator){
		int newD = bDenominator * denominator;
		int newN = bNumerator*denominator + numerator*bDenominator;
		
		Fraction temp = new Fraction(newN,newD);
		return temp;
	}
	
	public Fraction product(int bNumerator, int bDenominator) {
		Fraction temp = new Fraction (bNumerator*numerator, bDenominator*denominator);
		return temp;
	}
	
	public static Fraction reciprocal() {
		Fraction temp = new Fraction (denominator, numerator);
		return temp;
	}
	
	public Fraction simplify() {
		int q = denominator;
		int p = numerator;
		
		while (q != 0) {
			int t = q;
			q = p % q;
			p = t;
		}
		
		
		Fraction temp = new Fraction ((numerator/p),(denominator/p));
		return temp;
	}
	
}
