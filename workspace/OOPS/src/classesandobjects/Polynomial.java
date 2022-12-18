package classesandobjects;

public class Polynomial {

	private int[] coefficients;

	public Polynomial() {
		coefficients = new int[5];

	}

	public void setCoefficient(int degree, int coeff) {

		if (degree > coefficients.length - 1) {
			int[] temp = coefficients;
			coefficients = new int[degree + 1];

			for (int i = 0; i < temp.length; ++i) {

				coefficients[i] = temp[i];

			}
		}

		this.coefficients[degree] = coeff;
	}

	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print() {

		for (int i = 0; i < coefficients.length; ++i) {
			if (coefficients[i] != 0) {
				System.out.print(coefficients[i] + "x" + i + " ");
			}
		}
	}

	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p) {
		Polynomial result = new Polynomial();
		int len = Math.min(coefficients.length, p.coefficients.length);
		int i;
		for (i = 0; i < len; ++i) {
			result.setCoefficient(i, coefficients[i] + p.coefficients[i]);
		}

		while (i < coefficients.length) {
			result.setCoefficient(i, coefficients[i]);
			++i;
		}
		while (i < p.coefficients.length) {
			result.setCoefficient(i, p.coefficients[i]);
			++i;
		}

		return result;

	}

	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p) {

		Polynomial result = new Polynomial();
		int len = Math.min(coefficients.length, p.coefficients.length);
		int i;
		for (i = 0; i < len; ++i) {
			result.setCoefficient(i, coefficients[i] - p.coefficients[i]);
		}

		while (i < coefficients.length) {
			result.setCoefficient(i, coefficients[i]);
			++i;
		}
		while (i < p.coefficients.length) {
			result.setCoefficient(i, -p.coefficients[i]);
			++i;
		}

		return result;

	}

	public int getCoef(int degree) {
		if (degree < this.coefficients.length) {
			return coefficients[degree];

		} else {
			return 0;
		}
	}

	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p) {

		Polynomial result = new Polynomial();

		for (int i = 0; i < coefficients.length; ++i) {
			for (int j = 0; j < p.coefficients.length; ++j) {

				int termDeg = i + j;
				int termCoef = this.coefficients[i] * p.coefficients[j];
				int oldCoef = result.getCoef(termDeg);
				result.setCoefficient(termDeg, termCoef + oldCoef);
			}
		}
		return result;
	}
}

//
//private int[] c=new int[100];
//private int degree1;
//private int max;
//
//public void setCoefficient(int degree, int coeff){
//  if(degree>max){
//      max=degree;
//  }
//    c[degree]=coeff;
//}
//
//// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
//public void print(){
//	for(int i=1;i<c.length;i++){
//        if(c[i]!=0){
//            System.out.print(c[i]+"x"+i+" ");
//        }
//    }
//}
//
//
//// Adds two polynomials and returns a new polynomial which has result
//public Polynomial add(Polynomial p){
//    Polynomial p1=new Polynomial();		//Class instance 
//    for(int i=0;i<c.length;i++){		//For traversing
//        p1.c[i]=this.c[i]+p.c[i];
//    }
//    return p1;
//}
//
//// Subtracts two polynomials and returns a new polynomial which has result
//public Polynomial subtract(Polynomial p){
//    Polynomial p1=new Polynomial();
//    for(int i=0;i<c.length;i++){
//        p1.c[i]=this.c[i]-p.c[i];
//    }
//		return p1;
//}
//
//// Multiply two polynomials and returns a new polynomial which has result
//public Polynomial multiply(Polynomial p){
//    int i,j;
//    Polynomial p1=new Polynomial();
//    for(int k=0;k<=this.max;k++){
//        for(int l=0;l<=p.max;l++){
//            p1.c[k+l]+=(this.c[k]*p.c[l]);
//        }
//    }
//	return p1;
//}