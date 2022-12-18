package recursion_assignment;

public class CheckAB {
	public static boolean checkAB(String input) {
		if(input.length()==0) {
			return true;
		}
		
		if(input.charAt(0)=='a') {
			if(input.substring(1).length()>1 && input.substring(1, 3).equals("bb")) {
				return checkAB(input.substring(3));
			}
			else {
				return checkAB(input.substring(1));
			}
		}
		else {
			return false;
		}
		// boolean smallAns= false;
				// if (input.length()==0) 
				// {
				// 	return true;
				// }
				// if (input.length()==1)
				// {
				// 	if (input.charAt(0)=='a') 
				// {
				// 		smallAns= true;
				// 		input=input.substring(1);
				// 	}
				// }
				// else if (input.length()==2)
				// {
				// 	if(input.charAt(0)=='a' && input.charAt(1)=='a')
				// {
				// 		smallAns= true;
				// 		input= input.substring(2);
				// 	}
				// } 
				// else if (input.length()>=3) 
				// {
				// 	if (input.charAt(0)=='a' && input.substring(1, 3).equals("bb")) 
				// {
				// 		smallAns= true;
				// 		input=input.substring(3);
				// 	} 
				// else if (input.charAt(0)=='a' && input.charAt(1)=='a') 
				// {
				// 		smallAns= true;
				// 		input= input.substring(1);
				// 	}
				// }
				// return smallAns && checkAB(input);
	}
	public static void main(String[] args) {
		System.out.println(checkAB("abbaabb"));

	}

}
