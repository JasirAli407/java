package ForLoop;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num =n;

		int dec =0;

		int pow=1;
		while(num>0) {
			int	digit= num%10;

			dec+=digit*pow;
			pow=pow*2;



			num=num/10;
		}
		System.out.println(dec);
	}





}


