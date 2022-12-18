package arraysintro;

public class Sort01 {
	 public static void sortZeroesAndOne(int[] arr) {
		 int st=0,end=arr.length-1;
		 while(st<end) {
			 if(arr[st]==1 && arr[end]==0) {
				 arr[st]=0;
				 arr[end]=1;
				 st++;
				 end--;
			 }
			 if(arr[st]==0) {
				 st++;
			 }
			 if(arr[end]==1) {
				 end--;
			 }
		 }
	 }
		 
//	     ANother way	 
//		 int nextZero=0;
//		 for(int i=0;i<arr.length;++i) {
//			 if(arr[i]==0) {
//				 int temp= arr[i];
//				 arr[i]=arr[nextZero];
//				 arr[nextZero]=temp;
//				 nextZero+=1;
//			 }
//		 }
//		 Another bad way
		 //	        int j =arr.length-1;
//	        for(int i=0;i<j;++i){
//	            if(arr[i]==1){
//	                for(;j>i;--j){
//	                    if(arr[j]==0){
//	                        arr[i]=0;
//	                        arr[j]=1;
//	                        --j;
//	                        break;
//	                    }
//	                }
//	            }
//	        }
//	    }
	public static void main(String[] args) {
		int[]arr= {1,0,1,1,1,0,1};
		sortZeroesAndOne(arr);
		for(int i=0;i<arr.length;++i) {
			System.out.print(arr[i]+" ");
		}
	}

}
