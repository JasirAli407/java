package arraysintro;

public class PairSum {
	public static int pairSum(int arr[], int x) {
		int sum=0;
		for(int i=0;i<arr.length;++i) {
			for(int j=i+1;j<arr.length;++j) {
				if(arr[i]+arr[j]==x) {
					sum+=1;
				}
			}
		}
	return sum;
	}
	public static void main(String[] args) {

	}

}
