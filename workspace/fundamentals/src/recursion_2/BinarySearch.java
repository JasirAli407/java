package recursion_2;

public class BinarySearch {
	public static int binarySearch(int []a,int x, int si, int ei) {
		if(si>ei) {
			return -1;
		}
		
		int midIndex= (si+ei)/2;
		
		if(a[midIndex]==x) {
			return midIndex;
		}
		else if (x > a[midIndex]) {
			
			return binarySearch(a,x,midIndex+1,ei);
		}
		else {
			
			return binarySearch(a,x,si,midIndex-1);
		}
	}

	public static void main(String[] args) {
		int []a= {1,2,3,4,5};
		System.out.println(binarySearch(a,5,0,a.length-1));

	}

}
