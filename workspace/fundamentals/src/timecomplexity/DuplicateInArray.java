package timecomplexity;

public class DuplicateInArray {
	public static int findDuplicate(int[] arr) {
		int arrSum=0;
		int n=arr.length;
		for(int i=0;i<n;++i) {
			arrSum+=arr[i];
		}
		int origSum=(n-2)*(n-1)/2;
		int duplicateNum=arrSum-origSum;
		return duplicateNum;
	}
	public static void main(String[] args) {
int [] arr= {0,1,2,2,3};
System.out.println(findDuplicate( arr));
		
	}

}
