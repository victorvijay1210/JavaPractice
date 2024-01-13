package streams_interviewprograms;

import java.util.Arrays;
import java.util.List;

public class printaveragevalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>list = Arrays.asList(1,2,3,4,5);
    Double avg=	list.stream().mapToInt(e->e).average().getAsDouble();
	System.out.println("The average value is:"+" "+ avg);

	}

}
