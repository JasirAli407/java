package arraysintro;

public class SwapAlternate {
	 public static void swapAlternate(int arr[]) {
		 int n=arr.length;
		     for(int i =0; i<n-1;i=i+2){
		   
		         int j=i+1;
		          int temp=arr[i];
		              
		             arr[i]=arr[j];
		         arr[j]=temp;
		     }    
		     } 
	public static void main(String[] args) {
		
	}

}
