package recursion_2;

public class QuickSort {
	  public static int partition(int a[],int si, int ei){
	        int pivot= a[si];
	        int count =0;
	        for(int i=si+1;i<=ei;++i){
	            if(a[i]<pivot){
	                count++;
	            }
	        }
	        int temp = a[si+count];
	        a[si+count]= pivot;
	        a[si]= temp;
	        
	        int i=si, j=ei;
	        int pivotIndex =si+count;
	   while(i<j){
//	        THIS will also work
	        if(a[i] >= pivot && a[j] < pivot){
	                int temp1 = a[i];
	                a[i]= a[j];
	                a[j]= temp1;
	                i++;
	                j--;
	            }
	       if(a[i]<pivot){
	           i++;
	       }
	       if(a[j]>=pivot){
	           j--;
	       }
	   }
//	        ankush sirs way!
	       // if(a[i]< pivot){
	       //     i++;
	       // }
	       // else if(a[j]>=pivot){
	       //     j--;
	       // }
	       // else{
	       //      int temp1 = a[i];
	       //          a[i]= a[j];
	       //          a[j]= temp1;
	       //          i++;
	       //          j--;
	       // }}
	           
	        return pivotIndex;
	        
	    }
		public static void quickSort(int a[],int si , int ei){
	        if(si>=ei){
	            return;
	        }
	        int pivotIndex = partition(a, si, ei);
	        
	        quickSort(a, si,pivotIndex-1);
	        quickSort(a, pivotIndex+1,ei);
	    } 
	    
		public static void quickSort(int[] input) {
	        quickSort(input,0,input.length-1);
		
		}
	public static void main(String[] args) {
		int a[]= {3,4,2,1,6,5};
		quickSort(a);
		for (int i=0; i<a.length;++i) {
			System.out.print(a[i]);
		}

	}

}
