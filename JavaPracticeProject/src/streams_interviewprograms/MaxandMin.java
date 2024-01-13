package streams_interviewprograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxandMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//max value
		List<Integer>list = Arrays.asList(10,20,30,40,50,60);
	Integer maxvalue=list.stream().max(Comparator.comparing(e->e)).get();
	System.out.println(maxvalue);
	Integer minvalue = list.stream().min(Comparator.comparing(e->e)).get();
	System.out.println(minvalue);

	}

}
