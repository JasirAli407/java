package Tests;

public class RectangularNumbers_ct1 {
	 public static void print(int N) {
		  int i=0, min=0, j=0;
	        for (i = 1; i <= N; i++) 
	        {
	            for (j = 1; j <= N; j++)
	            {
	                min = Math.min(i,j);
	                System.out.print(N - min + 1);
	            }
	            for (j = N - 1; j >= 1; j--)
	            {
	                min = Math.min(i,j);
	                System.out.print(N - min + 1);
	            }
	            System.out.println();
	        }

	        for (i = N - 1; i >= 1; i--) 
	        {
	            for (j = 1; j <= N; j++) 
	            {
	                min = Math.min(i,j);
	                System.out.print(N - min + 1);
	            }
	            for (j = N - 1; j >= 1; j--) 
	            {
	                min = Math.min(i,j);
	                System.out.print(N - min + 1);
	            }
	            System.out.println();
	        }
	 }
	public static void main(String[] args) {
		print(4);
	}

}
