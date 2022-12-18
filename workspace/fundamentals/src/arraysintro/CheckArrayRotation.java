package arraysintro;

public class CheckArrayRotation {
	 public static int arrayRotateCheck(int[] arr){
		 int i =0;
	        for(;i<arr.length-1;++i){
	            if(arr[i]>arr[i+1]){
	                return i+1;
	            }
	        }
	  return 0;
}
 public static void main(String[] args) {
	int[] arr= {5,6,1,2,3,4};
	System.out.println(arrayRotateCheck( arr));
	
}
}