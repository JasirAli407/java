package recursion_assignment;

public class StringToInteger {
	public static int convertStringToInt(String input){
		
//      code if we break for eg: 123|4
     if(input.length()==1){
 return input.charAt(0)-48;
}
     int smallAns=  convertStringToInt(input.substring(0,input.length()-1));
     int currDigit=input.charAt(input.length()-1)-48;
     int ans= smallAns*10+currDigit;
	return  ans;
 
}
     
//      code if we break for eg: 1|234
     // if(input.length()==1){
//  return input.charAt(0)-48;
//}
//      int smallAns=  convertStringToInt(input.substring(1,input.length()));
//      int currDigit=input.charAt(0)-48;
//      int ans= currDigit*((int)Math.pow(10,input.length()-1))+smallAns;
//	return  ans;
//  }
	public static void main(String[] args) {
System.out.println(convertStringToInt("00123"));
	}

}
