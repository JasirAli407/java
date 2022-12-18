package arraysintro;

public class MergeTwoSortedArrays {
	 public static int[] merge(int arr1[], int arr2[]) {
		 int[] arr3= new int [arr1.length+arr2.length];
		    int i=0,j=0;
		    int k=0;
		    	while(i<arr1.length && j<arr2.length) {
		    	if(arr1[i]<=arr2[j]) {
		    		arr3[k]= arr1[i];
		    		++i;
		    		++k;
		    	}
		    	else {
		    		arr3[k]=arr2[j];
		    		++j;
		    		++k;
		    	}
		    	}
		while(i<arr1.length) {
		    	arr3[k]=arr1[i];
		    	++i;
		    	++k;
		    }
		    while(j<arr2.length) {
		    	arr3[k]=arr2[j];
		    	++j;
		    	++k;
		    }
		    
		    
		    return arr3;
	    }
	 public static void  print(int[] arr) {
			for(int i =0;i<arr.length;++i) {
				System.out.print(arr[i]);
			}
	 }
	public static void main(String[] args) {
		int[]arr1= {1,4,6,10,13};
		int[]arr2= {2,5,7,9};
		int[] arr3 = merge(arr1,arr2);
		print(arr3);

	}

}
