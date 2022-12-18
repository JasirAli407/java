package ForLoop;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
int rev =0;
int num = n;
while (num>0) {
	int next = num%10;
	 rev = rev*10 + next;
	num=num/10;
}
 if (rev==n) {
	 System.out.print("true");
 }
 else {
	 System.out.print("false");
 }
    		
	}
}



	

