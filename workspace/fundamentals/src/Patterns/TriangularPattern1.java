package Patterns;
import java.util.Scanner;
public class TriangularPattern1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int p,i=1, n;
		n = s.nextInt();
	
		while(i<=n)
		{ int j=1;
          p=i;
		while(j<=i) {
			System.out.print(p);
			p++;
			j++;
		}System.out.println();
		i++;

		}
	}	




}
