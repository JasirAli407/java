package arraysintro;

public class CodeBinarySearch {
	public static int binarySearch(int[] arr, int x) {
	    int st=0;
	        int end=arr.length-1;
	        while(st<=end){
	 int mid = (st+end)/2;
	            if(arr[mid]<x){
	                st=mid+1;
	            }
	            else if (arr[mid]>x){
	                end=mid-1;
	            }
	            else {
	                return mid;
	            }
	        }
	    return -1;}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int index= binarySearch(arr,2);
		System.out.println("Index is :"+index);

	}

}
