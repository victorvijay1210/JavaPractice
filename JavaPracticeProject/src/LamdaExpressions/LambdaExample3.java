package LamdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Filtering and Sorting with Streams and Lambda
		List<String> names = new ArrayList<>(List.of("Charlie", "Alice", "David","Bob"));
	
		//Filter name start with A
		List<String> nameList =names.stream().filter(name->name.startsWith("A")).collect(Collectors.toList());

		System.out.println(nameList);
		
		//Sorted list ascending 
	 List<String> sortedList=names.stream().sorted().collect(Collectors.toList());
	 
	 System.out.println(sortedList);
	 
	 //reverse sorted descending
	 List<String> sortedLists=names.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
	 System.out.println(sortedLists);
	}

}
