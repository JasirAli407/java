package Tests;
import java.util.*;
public class faultyKeyboard {
	 public static void main(String[] args) {
			
//		 Scanner sc=new Scanner(System.in);
//		 int n= sc.nextInt();
//		 String str1= sc.next();
//		 String str2= sc.next();
		 String str1= "hello";
		 String str2= "hheeeloo";
		 int i=0,j=0;
		 while(i<str1.length()&& j <str2.length()) {
			 if(str1.charAt(i)==str2.charAt(j)) {
				 while(i<str1.length()&& j <str2.length()&&str1.charAt(i)==str2.charAt(j)) {
					 j++;
				 }}
				 else if(str1.charAt(i)==str2.charAt(j-1)&&str1.charAt(i)!=str2.charAt(j)) {
					 i++;
				 }
				 else {System.out.println("false");
				 return;}
			 }
		 System.out.println("true");
		 }
		    
	
}
