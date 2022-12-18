package recursion_assignment;

public class CheckPalindrome {
	public static boolean isStringPalindrome(String input) {
        if(input.length()<=1){
            return true;
        }
        if(input.charAt(0)==input.charAt(input.length()-1 )){
            return isStringPalindrome(input.substring(1,input.length()-1));
        }
        else{
            return false;
        }
    


//         MY CODE
// 	public static boolean isStringPalindrome(String input) {
// 	if(input.length()<=1){
//         return true;
//     }
//         boolean smallAns= isStringPalindrome(input.substring(1,input.length()-1));
//         if(smallAns == false){
//             return false;
//         }
//         else{
//             if(input.charAt(0)==input.charAt(input.length()-1 )){
//                 return true;
//             }
//             else{
//                 return false;
//             }
//         }

// 	}
 }

	public static void main(String[] args) {
System.out.println(isStringPalindrome("aba"));
	}

}
