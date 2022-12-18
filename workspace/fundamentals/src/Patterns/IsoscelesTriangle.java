package Patterns;
import java.util.Scanner;
public class IsoscelesTriangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		n=s.nextInt();
		int i=1;
		while(i<=n) {
			int spaces =1, num=1;
			while(spaces<= (n-i)) {
				System.out.print(' ');
				spaces++;
			}
			while(num<=i) {
				System.out.print('*');
				num++;
			}
			int dec = i-1;
			while (dec >= 1) {


				System.out.print('*');
				dec = dec-1;
				}
			i++;
			System.out.println();}

	}

}
