package recursion_1;

public class CalculatePower {
public static int power(int x, int n) {
	
	if(n==0) {
		return 1;
	}
	int smallOutput=power(x,n-1);
		int output=x*smallOutput;
		return output;
	}
/* codezen soln
public static int power(int x, int n) {
if(x==0 && n==0){
return 0;
}

if(x==0){
return 0;}

if(n==0){
return 1;
}
int output;
int smallOutput=power(x,n/2);
if(n%2==0){
output=smallOutput*smallOutput;
return output;}
else{
output=x*smallOutput*smallOutput;
return output;}
}
*/
	public static void main(String[] args) {
System.out.println(power(2,4));

	}

}
