package arraysintro;

public class TripletSum {
	public static int findTriplet(int[] arr, int x) {
		int sum=0;
		    	for (int a= 0; a<arr.length;++a) {
		    		for(int b=a+1;b<arr.length;++b) {
		    				for(int c=b+1;c<arr.length;++c) {
		    						if(arr[a]+arr[b]+arr[c]==x) {sum+=1;
		    					}
		    				}
		    			}
		    		}
		    	
		    return sum;    }

	public static void main(String[] args) {

	}

}
