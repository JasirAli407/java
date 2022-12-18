package functions;

public class FunctionOverLoading {
	public static int sum(int a,int b) {
		return a+b;
	}
	public static int sum(int a) {
		return ++a;
	}

	public static double sum(double a, double b) {
		return a+b;
	}
	
	public static void main(String[] args) {

		int a=10,b=5;

				System.out.println(sum(a,b));
		System.out.println(sum(b));
		System.out.println(sum(10.6,7.5));
	}

}
