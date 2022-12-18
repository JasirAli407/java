package timecomplexity;
import java.util.Arrays;

public class PairSumInArray {
public static int pairSum(int[] arr, int num) {
	Arrays.sort(arr);
	int startIndex=0;
	int endIndex=arr.length-1;
	int numPairs=0;
	while(startIndex < endIndex) {
		if(arr[startIndex]+arr[endIndex]<num) {
			startIndex++;
		}
		else if(arr[startIndex]+arr[endIndex]>num) {
			endIndex--;
		}
		else {
			int elementAtStart=arr[startIndex];
			int elementAtEnd=arr[endIndex];
			if(elementAtStart==elementAtEnd) {
				int totalElements= (endIndex-startIndex)+1;
				numPairs+=(totalElements*(totalElements-1)/2);
				return numPairs;
			}
			int tempStartIndex=startIndex+1;
			int tempEndIndex=endIndex-1;
			while(tempStartIndex<=tempEndIndex && arr[tempStartIndex]==arr[startIndex]) {
				tempStartIndex++;
				
			}
			while(tempEndIndex>=tempStartIndex && arr[tempEndIndex]==arr[endIndex] ) {
				tempEndIndex--;
			}
			int totalElementsFromStart=tempStartIndex-startIndex;
			int totalElementsFromEnd=endIndex-tempEndIndex;
			numPairs+=(totalElementsFromStart*totalElementsFromEnd);
			
			startIndex=tempStartIndex;
			endIndex=tempEndIndex;
		}
	}
	return numPairs;
		
	}
	public static void main(String[] args) {
		int [] arr= {1,3,3,4,5,8,9,9,9,15};
		System.out.println(pairSum(arr, 12));

	}

}
