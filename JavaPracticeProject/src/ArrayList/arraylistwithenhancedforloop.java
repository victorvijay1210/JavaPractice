package ArrayList;

import java.util.ArrayList;

public class arraylistwithenhancedforloop {

	public static void main(String[] args) {

ArrayList list1= new ArrayList();
		
		list1.add("Vijay");
		list1.add('K');
		list1.add(100);
		
		for(Object obj:list1) {
			  System.out.println("The value is "+ obj );

		}
		
		
		
	}

}
