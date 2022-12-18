package milestone3_test4;

public class SplitArray {
public static boolean splitArray(int input[]) {
		
		return check(input,0,0,0);
	}
    
     public static boolean check(int arr[], int si, int lsum, int rsum) 
	{ 
         //lsum for sum of numbers divisible by 5 and rsum for sum of numbers divisible by 3
  
    	if (si == arr.length) 
        {
            return lsum == rsum;
        }
         
    	if (arr[si] % 5 == 0)
        {
            lsum += arr[si];
        }
        else if (arr[si] % 3 == 0) 
        {
            rsum += arr[si]; 
        }
        else
        {
         boolean leftAns= check(arr,  si+1,  lsum+arr[si],  rsum) ;
            boolean rightAns= check(arr,  si+1,  lsum,  rsum+arr[si]) ;
            
            return leftAns||rightAns;
        }
         
    	return check(arr,si+1,lsum,rsum); 
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
