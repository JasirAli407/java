package Patterns;
import java.util.Scanner;
public class AlphaPattern4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i=1, n;
		n = s.nextInt();
		while(i<=n)
		{
	int j=1;
	char p;
	p = (char)('A'+i-1);
	while(j<=i)
	{
		
		System.out.print(p);
		p= (char)(p+1);
		j++;
	}System.out.println();
	i++;
		
		}
	}	


	

}
