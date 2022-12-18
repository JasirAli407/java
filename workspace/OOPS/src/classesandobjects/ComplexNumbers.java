package classesandobjects;

public class ComplexNumbers {
	private int realNumber;
	private int imaginaryNumber;

	public ComplexNumbers(int a, int b) {
		this.realNumber = a;
		this.imaginaryNumber = b;

	}

	public void setRealNum(int a) {
		this.realNumber = a;

	}

	public void setImaginaryNum(int a) {
		this.imaginaryNumber = a;
		;
	}

	public void print() {

		System.out.println(realNumber + " " + "+" + " " + "i" + imaginaryNumber);

	}

	public void plus(ComplexNumbers c2) {
		this.realNumber = this.realNumber + c2.realNumber;
		this.imaginaryNumber = this.imaginaryNumber + c2.imaginaryNumber;
	}

	public void multiply(ComplexNumbers c2) {
		int temp = this.realNumber * c2.realNumber - this.imaginaryNumber * c2.imaginaryNumber;

		this.imaginaryNumber = this.realNumber * c2.imaginaryNumber + this.imaginaryNumber * c2.realNumber;

		this.realNumber = temp;
	}

	public static ComplexNumbers add(ComplexNumbers c1, ComplexNumbers c2) {
		int newReal = c1.realNumber + c2.realNumber;
		int newImag = c1.imaginaryNumber + c2.imaginaryNumber;
		ComplexNumbers c3 = new ComplexNumbers(newReal, newImag);
		return c3;

	}

}
