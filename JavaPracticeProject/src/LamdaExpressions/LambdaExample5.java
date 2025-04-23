package LamdaExpressions;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Chaining map() with Other Stream Operations
        List<String> names = List.of("Victor", "Raj", "Vignesh", "John");
        // Map each name to its length
        // // Filter lengths greater than 4
    List<Integer>data=names.stream().map(name->name.length()).filter(length->length>4).collect(Collectors.toList());
     System.out.println(data);
     
    // The lambda expression inside map() transforms each element in the stream.

    //  we can chain map() with other operations like filter(), reduce(), etc., to process data in a functional style.
	}

}
