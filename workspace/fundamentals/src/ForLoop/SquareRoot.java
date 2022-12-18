package ForLoop;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=0;
		int num=0;
		while(num<=n) {
			i++;
			num=i*i;

		}
		System.out.print(i-1);
	}
}


