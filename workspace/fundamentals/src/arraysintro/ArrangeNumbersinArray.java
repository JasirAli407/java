package arraysintro;
import java.util.Scanner;
public class ArrangeNumbersinArray {

//	public static int[] takeInput() {
//	Scanner sc = new Scanner(System.in);
//	int n= sc.nextInt();
//	int[] arr= new int[n];
//	for (int i=0;i<n;i++) {
//		System.out.println("enter element at" + i +"th index;");
//		arr[i]= sc.nextInt();
//	}
//	return arr;
//	}
	 public static void arrange(int[] arr, int n) {
		  if(arr.length==0){
	            return;
	        }
	        else{
	            int num=1;
	            for (int i=0; i<=(n-1)/2;i++){
	                arr[i]= num;
	               
	                num+=2;
	            }
	               if (n%2!=0){
	                   num= n-1;

	               }
	                else{num=n;}
	                for(int i=(n-1)/2+1;  i<n; i++){
	                    arr[i]=num;
	                   
	                    num-=2;
	                    
	                }}
	        }
//		  or
//		  int left =0;
//		  int right = n-1;
//				  int counter=1;
//		  while(left<=right) {
//			  if(counter%2==1) {
//				  arr[left]=counter;
//				  counter+=1;
//				  left+=1;
//			  }
//			  else {
//				  arr[right]= counter;
//				  counter+=1;
//				  right-=1;
//			  }
//			  }
//		  }
	    
	
	
	public static void main(String[] args) {
		
		

	}

}
