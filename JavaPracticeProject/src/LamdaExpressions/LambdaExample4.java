package LamdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>(List.of("Charlie", "Alice", "David","Bob"));
		//The map() function is used to transform each element of a stream.
	List<String> upperCaseNames=names.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
	System.out.println(upperCaseNames);

	}

}
