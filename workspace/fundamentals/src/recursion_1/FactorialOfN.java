package recursion_1;

public class FactorialOfN {
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		int smallOutput=fact(n-1);
		int output=n*smallOutput;
		return output;
	}

	public static void main(String[] args) {
int result=fact(5);
System.out.println(result);
	}

}
