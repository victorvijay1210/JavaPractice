package LamdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class LambdaExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>(List.of("Victor","Vijay","Bubu","Dudu"));
		//Iterating over a list using Lambda (without using for loop)
		// Using Lambda expression to iterate through the list
		names.forEach(name->System.out.println(name));

	
	}

}
