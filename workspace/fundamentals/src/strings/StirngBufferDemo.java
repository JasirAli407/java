package strings;

public class StirngBufferDemo {

	public static void main(String[] args) {
StringBuffer str= new StringBuffer("abc");
str.setCharAt(0, 'd');
str.append("def");
// System.out.println(str+" "+ str.length());
String s ="d";
//for(int i=0;i<5;++i) {
//	s+='z';// this is not recommended bcos every time new memory is created to store
//	str=str.append("z");
// }
//System.out.println(str);
	
for(int i=0;i<5;++i) {
	str=str.append((char)('a'+i));
	System.out.println(str);
}
}

}
