package milestone3_test4;

public class MinimumCountSquare {
	public static int minCount(int n){
		if(n<=1){
            return n;
        }
        
        int ans = n;
        
        for(int i=1;i<=n;++i){
            int iSquare= i*i;
            
            if(iSquare > n){
                break;
            }
            
            ans= Math.min(ans,minCount(n-iSquare)+1);
        }
        return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
