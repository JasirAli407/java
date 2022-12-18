package fundamentals;

import java.util.Scanner;

public class CheckPrimality_lec4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n , div = 2;
		n= s.nextInt();
		boolean isprime = true;
		while(div <= (n-1))   // or (div<=n/2)
		{
			if(n % div == 0)
			{
				System.out.print("composite");  
            	 return;
          //	isprime = false;
				}
			div =div +1;
		}
		System.out.print("prime");
		//if (isprime == true) //alternatively,  if(isprime)
		//{
		//System.out.print(n+ " is prime");	
		//}
		//else {System.out.print(n + " is composite");}
		
			
			
				
			
			
		}
				

		
	


	}


