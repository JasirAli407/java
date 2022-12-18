package ForLoop;

import java.util.Scanner;

public class NumerStarPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1;
		while(row<=n) {
			int col=n;
			for(;col>=1;col--) {
				if(col==row) {
					System.out.print("*");
				}
				else {
					System.out.print(col);
				}
			}
			System.out.println();
			row++;
		}
	}
}





