package recursion_1;

public class LastIndexOfANumberInArray {
	public static int lastIndexBetter(int arr[],int x,int startIndex){
		if(startIndex==arr.length){
			return -1;
		}
		int ans= lastIndexBetter(arr,x,startIndex+1);
		if(ans!= -1 ){
			return ans;
		}

		else{
			if(arr[startIndex]==x) {
				return startIndex;
				}
			else{
				return ans;}}
	}
	public static int lastIndex(int input[], int x) {
		return lastIndexBetter(input,x,0);

	}
	//      Not good approach
	//		public static int lastIndex(int input[], int x) {
	// 		if(input.length==0){return -1;}
	//	         int smallArray[]=new int [input.length-1];

	//	         for(int i=1;i<input.length;++i){
	//	             smallArray[i-1]=input[i];
	//	         }

	//	         int ans = lastIndex(smallArray,x);

	//	         if(ans==-1 && input[0]==x){
	//	             return 0;
	//	         }
	//	         else if(ans != -1){
	//	             return ans+1;
	//	         }
	//	         else{ return ans;}
	//		}
	public static void main(String[] args) {
		int arr[]= {2,3,4,5,2,4};
		int x=10;
		System.out.println(lastIndex(arr,x));
	}

}
