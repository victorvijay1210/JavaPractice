package Setdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class convertingSetintoArrayList {

	public static void main(String[] args) {


		Set<String> values = new HashSet<>();
		
		values.add("vijay");
		values.add("ajay");
		values.add("manish");
		values.add("rahul");
		values.add("joyce");
		values.add("aravind");
		values.add("aravind");
		
		System.out.println(values);
		List<String>ls = new ArrayList<>(values);
		
		System.out.println(ls.get(1));
		
	}

}
