package ForLoop;

import java.util.Scanner;

public class TermsOfAPWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int count = 0;
		int n =1;
		while(count<x) {
			
			int num = 3*n+2;
			if (num%4 != 0){
				System.out.print(num +" ");
				count= count + 1;
			}
			n++;
		}

	}





}


