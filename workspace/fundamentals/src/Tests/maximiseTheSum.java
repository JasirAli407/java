package Tests;

public class maximiseTheSum {
	public static long maximumSumPath(int[] input1, int[] input2) {
		long sum1=0, sum2=0;int i=0,j=0;
		long maxSum=0;
		while(i<input1.length && j<input2.length) {
			if(input1[i]<input2[j]) {
				sum1+=input1[i++];
				
			}
			else if(input2[j]<input1[i]) {
				sum2+=input2[j++];
				
			}
			else {
				
				maxSum+=(Math.max(sum1, sum2)) + input1[i];
				sum1=0;
				sum2=0;
				i++;
                j++;
			}
		}
		while(i<input1.length) {
			sum1+=input1[i++];
			
		}
		while(j<input2.length) {
			sum2+=input2[j++];
			
		}
        maxSum += Math.max(sum1,sum2);
        
		return maxSum;
	}
	public static void main(String[] args) {
		int [] arr1= {638973 ,645291, 675620 ,816372 ,1506908, 1967694, 2254043, 3372745, 4391096, 4664775, 4969272, 5136139 ,5284404, 5290990, 5738346, 6647179 ,8530991 ,8561173 ,8740274 ,9924137 };
		int[] arr2= {932401 ,1042418 ,1535844, 1607325, 1925530 ,2674334, 3222671 ,3637272 ,5103702 ,6304131, 6318625, 6570572, 6918600, 7566677 ,7923001, 8211633 ,8278595, 8588260 ,9575465 ,9782926 
};
		System.out.println(maximumSumPath(arr1,arr2));

	}

}
