package streams_interviewprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class printsumofnumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
	Integer sum	=list.stream().reduce((a,b)->a+b).get();
	
	System.out.println("Total sum is :"+" "+ sum);

	}

}
