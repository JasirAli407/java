package recursion_1;

public class CheckNumberInArray {
public static boolean checkNumber(int input[], int x) {
		
		if(input.length==0){
            return false;
        }
        
        if(input[0]==x){
            return true;
        }
        int []smallArray= new int [input.length-1];
        for(int i=1;i<input.length;++i){
            smallArray[i-1]=input[i];
        }
        return checkNumber(smallArray,x);
    
	}
	public static void main(String[] args) {

	}

}
