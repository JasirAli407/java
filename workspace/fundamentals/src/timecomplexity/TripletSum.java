package timecomplexity;
import java.util.Arrays;
public class TripletSum {

	public static int tripletSum(int[] arr, int num) {
		Arrays.sort(arr);
		int n=arr.length;
		int numTriplets=0;
		for(int i=0;i<n;++i) {
			int pairSumFor=num-arr[i];
			int numPairs=pairSum(arr,i+1,n-1,pairSumFor);
			numTriplets+=numPairs;
			
		}
        return numTriplets;
	}
        private static int pairSum(int[]arr,int startIndex,int endIndex,int num) {
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
		int [] arr= {1, 2 ,3, 4, 5, 6 ,7 };
		System.out.println(tripletSum(arr,12 ));
	}

}
