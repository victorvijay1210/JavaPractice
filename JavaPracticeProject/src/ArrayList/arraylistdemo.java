package ArrayList;

import java.util.ArrayList;

public class arraylistdemo {

	public static void main(String[] args) {

		ArrayList list= new ArrayList();
		
		list.add("Vijay");
		list.add('K');
		list.add(100);
		
      int getsize=list.size();
      
      
      for(int i=0;i<getsize;i++) {
    	  System.out.println("The value is "+ list.get(i));
      }
      
	}

}
