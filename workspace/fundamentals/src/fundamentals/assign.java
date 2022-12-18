package fundamentals;
import java.util.Scanner;
public class assign {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n , i;
		n= s.nextInt();
		i = 2;
		while ( i <= (n/2))
		{
		if(n%i==0) {
		System.out.println(i);
         }
		i=i+1;
		}
				
			
		
		
		
	}

}
