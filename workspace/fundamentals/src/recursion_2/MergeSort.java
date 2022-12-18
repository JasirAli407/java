package recursion_2;

public class MergeSort {

	
	public static void merge(int []s1,int [] s2,int [] dest) {
		int i=0,j=0,k=0;
		while(i<s1.length && j<s2.length) {
			if(s1[i]<s2[j]) {
				dest[k]=s1[i];
				++i;
				k++;
			}
			else {
				dest[k]=s2[j];
				j++;
				k++;
			}
		}
		while(i<s1.length) {
			dest[k]=s1[i];
			++i;
			k++;
		}
		while(j<s2.length) {
			dest[k]=s2[j];
			j++;
			k++;
		}
			
	}


public static void mergeSort(int[] input){
	if(input.length<=1) {
		return ;
	}
	
	
		int [] a=new int [input.length/2];
		int b[]=new int [input.length-a.length];
		
		for (int i=0;i< input.length/2;++i) {
			a[i]=input[i];
		}
		for(int i=input.length/2;i<input.length;++i) {
			b[i-input.length/2]=input[i];
		}
		
	mergeSort(a);
	mergeSort(b);
	merge(a,b, input);
	
	
	}
	public static void main(String[] args) {
int arr[]= {3,7,1,4,2,6};
mergeSort(arr);
for(int i=0;i<arr.length;++i) {
	System.out.print(arr[i]+" ");
}

	}

}
