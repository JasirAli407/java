package timecomplexity;

public class FindUniqueElement_xor {
	public static int findUnique(int[] arr) {
		int xor=0;
		for(int i=0;i<arr.length;++i) {
			
			xor=xor^arr[i];
		}
		return xor;
		
	}

	public static void main(String[] args) {
int [] arr= {2,4,7,2,7};
System.out.println(findUnique( arr));
	}

}
