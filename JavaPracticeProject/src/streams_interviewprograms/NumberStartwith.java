package streams_interviewprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartwith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>list = Arrays.asList(2,22,234,567,888,99,278);
		
		List<Integer> startno=list.stream().
		map(e -> String.valueOf(e)).
		filter(e-> e.startsWith("5")).
		map(e->Integer.parseInt(e)).
		collect(Collectors.toList());
		System.out.println(startno);

	}

}
