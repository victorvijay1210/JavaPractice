package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	 	List<Person> people = new ArrayList<>();
		people.add(new Person("dudu", 28));
        people.add(new Person("bubu", 26));
        people.add(new Person("manish", 14));
        
        Collections.sort(people);
        
        for(Person p: people) {
        	System.out.println(p);
        }
        
	 
	 
	
        
    	List<Books> book = new ArrayList<Books>();
    	book.add(new Books(1000, "DSA Book"));
    	book.add(new Books(600, "Opps Book"));
    	book.add(new Books(345, "AutomationBook"));
    	
    	Collections.sort(book);
    	
    	for(Books b: book) {
    		System.out.println(b);
    	}
	}
	

	

}
