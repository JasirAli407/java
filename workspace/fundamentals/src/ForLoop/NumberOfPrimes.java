package ForLoop;
import java.util.Scanner;
public class NumberOfPrimes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=2;i<=n;i++) {
			boolean isPrime = true;
			for(int div = 2;div<i;div++) {
				if(i%div==0) {
					isPrime=false;
					break;

				}
			}if(isPrime == true) {
				System.out.println(i);} 
		}
	}

}















