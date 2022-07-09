package stringdemo;

import java.util.Scanner;

public class palindromestring {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your String here");
		
	String str1=sc.next();
	String newstr = str1;
	
	String rev = "";
	
	for(int i= str1.length()-1; i>=0;i--) {
		rev = rev+str1.charAt(i);
		
	}
	
	if(newstr.equals(rev)) {
		System.out.println("The given string is palindrome");
	}
	else {
		System.out.println("The given string is not a palindrome");
	}
		
		
		
		
	}

}
