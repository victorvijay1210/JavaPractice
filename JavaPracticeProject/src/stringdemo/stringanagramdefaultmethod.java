package stringdemo;

import java.util.Arrays;
import java.util.Collections;

public class stringanagramdefaultmethod {

	
	public static boolean stringisAnagram(String str1, String str2) {
		
		String st1= str1.replace("\\s", "");
		String st2 = str2.replace("\\s", "");
		
		if(st1.length()!=st2.length()) {
			return false;
		}

		else {
		char[] chr1=st1.toLowerCase().toCharArray();
		char[] chr2= st2.toLowerCase().toCharArray();
		
		Arrays.sort(chr1);
		Arrays.sort(chr2);
		
		return Arrays.equals(chr1, chr2);
		
		}
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {

		
		
		System.out.println(stringisAnagram("RAT", "Art"));
		
		
		
		
		
		
	}

}
