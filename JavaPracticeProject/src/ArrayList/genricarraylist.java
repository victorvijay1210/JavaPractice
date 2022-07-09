package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class genricarraylist {

	public static void main(String[] args) {

		
		List<String>ls= new ArrayList<String>();
		
		ls.add("Vijay");
		ls.add("Ajay");
		ls.add("joyce");
		ls.add("Manish");
	
		
		for(Object obj:ls) {
			
			System.out.println(obj);
		}
		
		
	}

}
