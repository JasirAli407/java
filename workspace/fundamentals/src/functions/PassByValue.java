package functions;

public class PassByValue {
public static void increment(int n) {
	n++;
	System.out.println(n);
}
	public static void main(String[] args) {
int n=10;
increment(n);
System.out.print(n);
	}
//watch the screenshot note to know more about PassByValue
}
