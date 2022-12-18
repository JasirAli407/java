package arraysintro;

public class Sort012 {
	 public static void sort012(int[] arr){
	    int i=0,nZ=0,nT=arr.length-1;
	    while(i<=nT) {
	    	if(arr[i]==0) {
	    		int temp= arr[i];
	    		arr[i]=arr[nZ];
	    		arr[nZ]=temp;
	    		++nZ;
	    		++i;
	    		
	    	}
	    	
	    	else if(arr[i]==2) {
	    		int temp=arr[i];
	    		arr[i]=arr[nT];
	    		arr[nT]= temp;
	    		--nT;
	    	}
	    	else {++i;}
	    }
	    }
	 public static void  print(int[] arr) {
			for(int i =0;i<arr.length;++i) {
				System.out.print(arr[i]);
			}
		}
	public static void main(String[] args) {
		int[] arr= {1,2,1,2,1,0,2};
		sort012(arr);
		print(arr);
	}

}
