package Setdemo;

import java.util.HashSet;
import java.util.Set;

public class Hashsetdemo {

	public static void main(String[] args) {

		Set<String> values = new HashSet<>();
		
		values.add("vijay");
		values.add("ajay");
		values.add("manish");
		values.add("rahul");
		values.add("joyce");
		values.add("aravind");
		
		
		
		for (Object obj:values) {
			System.out.println(obj);
		}
		
	}

}
