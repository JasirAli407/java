package timecomplexity;

public class ArrayEquilibriumIndex {
	public static int arrayEquilibriumIndex(int[] arr){  
int leftSum=0;
int rightSum=0;
for(int i=0;i<arr.length;i++) {
	rightSum+=arr[i];
	}
for(int i=0;i<arr.length;i++) {
	rightSum-=arr[i];
	if(leftSum==rightSum) {
		return i;
	}
	leftSum+=arr[i];
}
return -1;		
		
		//      MY CODE          
		//        if(arr.length==0){return -1;}
		//		int leftst=0,i=leftst,mid=1,leftSum=arr[0];
		//		int rightst=mid+1;
		//		int rightSum=0;
		//		for(int j=rightst;j<arr.length;++j) {
		//			rightSum+=arr[j];
		//		}
		//		while(leftSum<rightSum) {
		//			rightSum-=arr[rightst];
		//			rightst++;
		//			mid++;
		//			i++;
		//			leftSum+=arr[i];
		//		}
		//		if(leftSum==rightSum) {
		//			return mid;
		//		}
		//		return -1;
	}
	public static void main(String[] args) {
		int []arr= {1,4,9,3,2};
		System.out.println(arrayEquilibriumIndex(arr));

	}

}
