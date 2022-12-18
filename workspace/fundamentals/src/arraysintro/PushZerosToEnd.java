package arraysintro;

public class PushZerosToEnd {
	 public static void pushZerosAtEnd(int[] arr) {
	    for(int k=0,i=0;i<arr.length;++i) {
	    	if(arr[k]!=0) {
	    		++k;
	    	}
	    	else if (arr[k]==0 && arr[i]!=0) {
	    		int temp = arr[i];
	    		arr[i]= arr[k];
	    		arr[k]= temp;
	    		++k;
	    	}
	    }
	    }public static void  print(int[] arr) {
	    	for(int i =0;i<arr.length;++i) {
	    		System.out.print(arr[i]);
	    	}
	    }
	    	public static void main(String[] args) {
	    		int[] arr = {2,0,0,1,3,0,0};
	    		pushZerosAtEnd(arr);
	    		print(arr);

	

	}

}
