package streams_interviewprograms;

import java.util.Arrays;
import java.util.List;

public class squareofvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(1,20,30,40,50,60,70);
		double withoutfilter = list.stream().mapToInt(e->e*e).average().getAsDouble();
		double withfilter = list.stream().mapToInt(e->e*e).filter(e->e>100).average().getAsDouble();
		
		
		System.out.println("Total average value :"+" " +withoutfilter);
		System.out.println("Total average value :"+" " +withfilter);
		
	}

}
