package recursion_assignment;

public class Multiplication {
	public static int multiplyTwoIntegers(int m, int n){
		if(n==0 || m==0){
	        return 0;
	    }
	        int smallAns = multiplyTwoIntegers(m,n-1);
	        return smallAns+m;
		}
	public static void main(String[] args) {
System.out.println(multiplyTwoIntegers(3,4));
	}

}
