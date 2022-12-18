package recursion_1;

public class FirstIndexOfANumber {
public static int firstIndexBetter(int a[],int x,int startIndex) {
	if(startIndex == a.length) {
		return -1;
	}
	if(a[startIndex]==x) {
		return startIndex;
	}
	return firstIndexBetter( a,x, startIndex+1);
	
}

public static int firstIndex(int input[], int x) {
	return firstIndexBetter( input,x, 0);
	
}
// not good approach
// public static int firstIndex(int input[], int x) {
 // if(input.length==0){
 // return -1;
 // }
 // if(input[0]==x){return 0;}
 // int smallArray[]=new int [input.length-1];
 // for(int i=1;i<input.length;++i){
 // smallArray[i-1]=input[i];
 // }
 // int ans= firstIndex(smallArray,x);
 // if(ans== -1){return ans;}
 // return ans+1;
// }

	public static void main(String[] args) {
int arr[]= {1,2,3,4,5};
System.out.println(firstIndex(arr, 7));

	}

}
