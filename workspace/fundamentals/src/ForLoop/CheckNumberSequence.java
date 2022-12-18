package ForLoop;

import java.util.Scanner;

public class CheckNumberSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isDec = true;
		int i =1;
		int prev=sc.nextInt();
		while (i<=(n-1)) {
			int curr=sc.nextInt();
			if(curr==prev) {
				System.out.print("false");
				return;
			}
			else if (curr<prev) {

			}
			else if(curr>prev) {
				isDec=false;

			}
			if(isDec==false && curr<prev) {
				System.out.print("false");
				return;
			}
			prev=curr;
			i++;
		}System.out.print("true");
	}
}





