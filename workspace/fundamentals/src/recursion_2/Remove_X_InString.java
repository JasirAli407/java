package recursion_2;

public class Remove_X_InString {
	public static String removeX(String input){
		if(input.length()==0){
            return input;
        }
        
        String smallString= removeX(input.substring(1));
        
        if(input.charAt(0)=='x'){
            return smallString;
        }
        else{
            return input.charAt(0)+smallString;
        }

	}
	public static void main(String[] args) {
String str="axbxcx";
System.out.println(removeX(str));
	}

}
