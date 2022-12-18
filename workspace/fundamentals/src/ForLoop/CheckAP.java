package ForLoop;

import java.util.Scanner;

public class CheckAP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int prev=sc.nextInt();
		int curr = sc.nextInt();
		int diff = curr- prev;
		int count =3;
		boolean ap=true;
		while(count<=n) {
			prev=curr;
			curr= sc.nextInt();
			int tempD =curr- prev;
			if (tempD!=diff) {ap= false;

			System.out.print(ap);
			return;}

			count++;
		}
		System.out.print(ap);

	}
}





