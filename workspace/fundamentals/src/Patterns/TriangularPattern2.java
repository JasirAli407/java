package Patterns;
import java.util.Scanner;
public class TriangularPattern2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i=1, n;
		n = s.nextInt();
		while(i<=n)
		{
	int j=1;
	while(j<=i) {
		System.out.print(j);
		j++;
	}System.out.println();
	i++;
		
		}
	}	


	

}
