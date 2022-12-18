package functions;

import java.util.Scanner;

public class CheckPrime {

	public static boolean checkPrime(int n) {
		for(int div=2; div<=n/2; div++) {
			if(n%div==0) {
				return false;
			}
		}return true;
	}
	public static boolean checkPrime2(int n) {
		boolean isPrime = true;
		for(int div=2; div<=n/2; div++) {
			if(n%div==0) {
				isPrime = false;
				break;
			}
		}return isPrime;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isPrime = checkPrime2(n);
		System.out.print(isPrime);

	}

}
