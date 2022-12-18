package Patterns;
import java.util.Scanner;
public class MirrorNumberPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		n=s.nextInt();
		int i=1;
		while(i<=n)
		{  
			int spaces=1,num=1; 
			while(spaces <= n-i)
			{
				System.out.print(' ');
				spaces++;
			}
			while(num<=i) {
				System.out.print(num);
				num++;
			}
			System.out.println();
			i++;
		}



	}

}
