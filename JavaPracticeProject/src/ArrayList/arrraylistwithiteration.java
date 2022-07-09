package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class arrraylistwithiteration {

	public static void main(String[] args) {

   ArrayList list= new ArrayList();
		
		list.add("Vijay");
		list.add('K');
		list.add(100);
		
	Iterator it	=list.iterator();
	
	while(it.hasNext()) {
		
	System.out.println(	it.next());
	}
	
	}

}
