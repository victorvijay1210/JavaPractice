package stringdemo;

public class Stringreverse {

	public static void main(String[] args) {

//using stringbuilder		
StringBuilder SB = new StringBuilder("Vijay");	
System.out.println(SB.reverse());


//using stringbuffer
StringBuffer Bf = new StringBuffer("Vijay");
System.out.println(Bf.reverse());


//using normal string reverse 
String s1 = "Vijay";

int length=s1.length();

for(int i=length-1;i>=0;i--) {
char	rev=s1.charAt(i);
System.out.println(rev);
}

	}
}
