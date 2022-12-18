package Patterns;
import java.util.Scanner;
public class HalfDiamondPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;  
		n=s.nextInt();
		int row = 2*n+1;
		int a = (row/2+1), b=row/2;
		int i=1;
		while (i<=a) {
			System.out.print('*');
			int asc=1;
			while(asc<= i-1) {
				System.out.print(asc);
				asc++;}
			int desc = i-2;
			while(desc >=1) {
				System.out.print(desc);
				desc = desc-1;}
			if(i>1) {
				System.out.print('*');
			}
			i++;
			System.out.println();
		}

		i=b;

		while(i>=1) {
			System.out.print('*');
			int inc=1;
			while (inc<= i-1) {
				System.out.print(inc);
				inc++;
			}
			int dec=i-2;  
			while(dec>=1) {
				System.out.print(dec);
				dec= dec-1;}
			if (i>1) {
				System.out.print('*');

			}
			i=i-1;
			System.out.println();
		}


	}


}













