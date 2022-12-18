package recursion_1;

public class SumOfArray {
	public static int sum(int input[]) 
//appr-1 -- splitting array into two..adding arr[0] to the small array
	//	{
//		if(input.length==0){
//            return 0;
//        }
//        int []smallArray=new int[input.length-1];
//        for(int i=1;i<input.length;++i){
//            smallArray[i-1]=input[i];
//        }
//        int smallArraySum=sum(smallArray);
//        int arraySum=smallArraySum+input[0];
//        return arraySum;
		
//	}
	
//	appr-2 -- splitting and adding arr[last index]to small array
	{		
	if(input.length==0){
        return 0;
    }
    int []smallArray=new int[input.length-1];
    for(int i=0;i<input.length-1;++i){
        smallArray[i]=input[i];
    }
    int smallArraySum=sum(smallArray);
    int arraySum=smallArraySum+input[input.length-1];
    return arraySum;
	}
	
	public static void main(String[] args) {

	}

}
