package recursion_1;

public class IsArraySorted {
public static boolean isSortedBetter(int a[] , int startIndex) {
	if(startIndex==a.length-1) {
		return true;
	}
	if(a[startIndex]>a[startIndex+1]) {
		return false;
	}
	return isSortedBetter(a,startIndex+1);
}

public static boolean isSorted(int a[]) {
	if(a.length==1) {
		return true;
	}
	if(a[0]>a[1]) {return false;}
	int smallArray[]= new int [a.length-1];
	for(int i=1;i<a.length;++i) {
		smallArray[i-1]=a[i];
	}
	return isSorted(smallArray);
}
	public static void main(String[] args) {

	}

}
