package Patterns;
import java.util.Scanner;
public class DiamondOfStars {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, spaces;  
		n=s.nextInt();
		int a = (n/2+1), b=n/2;
		int stars  , i=1;
		while (i<= a){
			

				 spaces =1 ;
				while (spaces <= a-i)
				{
					System.out.print(' ');
					spaces++;
				}
                 stars =1;
				while(stars <= 2*i-1)
				{
					System.out.print('*');
					stars++;
				}
				System.out.println();
				i++;
				
			}
			i=b; 
			n=b;
			while (i>=1){
				spaces=1; stars = 1;
				while(spaces <=n-i+1){
					System.out.print(' ');
					spaces++;
					}
				
				while(stars<= 2*i-1)
				{
					System.out.print('*');
					stars=stars+1;}
				i=i-1;
				System.out.println();
			}

	}
		

	}
