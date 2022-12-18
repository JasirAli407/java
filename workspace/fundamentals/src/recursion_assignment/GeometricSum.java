package recursion_assignment;
/* Given k, find the geometric sum i.e.
1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) 
using recursion.
Input format :
Integer k
Output format :
Geometric sum (upto 5 decimal places)
Constraints :
0 <= k <= 1000
Sample Input 1 :
3
Sample Output 1 :
1.87500*/
public class GeometricSum {
	 public static double findGeometricSum(int k){
	        if(k==0){
	            return 1;
	        }
	        double a = findGeometricSum(k-1);
	        double ans= a+(1/Math.pow(2,k));
	        return ans;}

	    //     using seperate function for calculating x^n
	    // public static int power(int x, int n){
	    //     if(n==0){
	    //         return 1;
	    //     }
	    //     int smallAns=power(x,n-1);
	    //     int ans = x*smallAns;
	    //     return ans;
	    // } 
	    // 	public static double findGeometricSum(int k){
	    // if(k==0){
	    //     return 1;
	    // }
	    //         double a = findGeometricSum(k-1);
	    //         int num= power(2,k);
	    //         double ans= a+(1.0/num);
	    //         return ans;
	    // 	}
	public static void main(String[] args) {
System.out.println(findGeometricSum(3));
	}

}
