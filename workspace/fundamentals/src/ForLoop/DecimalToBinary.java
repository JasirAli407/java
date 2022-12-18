package ForLoop;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long quotient = n;
		long pv=1 ,ans=0;
		while(quotient>0) {
			long remainder = quotient%2;
			ans = ans+remainder*pv;
		pv=pv*10;
			quotient= quotient/2;
		}
	System.out.print(ans);
	
	}





}


