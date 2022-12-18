package fundamentals;
import java.util.Scanner;
public class Rough {
	    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
int n, r,d, o=0, e=0 ;

n=s.nextInt();

while(n>0) {                  // 1234
r= n/10;                   //   123 (because int)
d= n%10;                    //   4

 if(d%2==0)              
{
e = e+d;	}


else {
	o= o+d;
}
n=r;}                       // 123
 System.out.print(e+" ");
System.out.print(o);



	    
	    
	    
	    }    
	    
	    }