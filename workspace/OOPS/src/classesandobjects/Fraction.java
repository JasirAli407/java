package classesandobjects;

public class Fraction {
	private int numerator;
	private int denominator;

	public Fraction(int numerator, int denominator) {
		if (denominator == 0) {
			denominator = 1;
		}
		this.numerator = numerator;
		this.denominator = denominator;
		simplify();
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
		simplify();
	}

	public void setDenominator(int denominator) {
		if (denominator == 0) {
			return;
		}
		this.denominator = denominator;
		simplify();
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void print() {
		System.out.println(numerator + "/" + denominator);
	}

	private void simplify() {
		int gcd = 1;
		int min = Math.min(numerator, denominator);
		for (int i = 2; i <= min; ++i) {
			if (numerator % i == 0 && denominator % i == 0) {
				gcd = i;
			}
			this.numerator = this.numerator / gcd;
			this.denominator = this.denominator / gcd;
		}
	}

	public void increment() { /* eg:3/4; 3/4+1=3+4/4 */
		numerator = numerator + denominator;
		simplify();
	}

	public void add(Fraction f2) {
		/*
		 * we need to update the first fraction with the result
		 */

		this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
		this.denominator = this.denominator * f2.denominator;
		simplify();
	}

	public static Fraction add(Fraction f1, Fraction f2) {
		int newNume = f1.numerator * f2.denominator + f1.denominator * f2.numerator;
		int newDeno = f1.denominator * f2.denominator;
		Fraction f3 = new Fraction(newNume,
				newDeno); /*
							 * the new fraction variant is static bcos it belongs to class
							 */
		return f3;
	}

}
