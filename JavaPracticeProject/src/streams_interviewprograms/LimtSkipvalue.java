package streams_interviewprograms;

import java.util.Arrays;
import java.util.List;

public class LimtSkipvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>list = Arrays.asList(100,20,300,40,500,6,88,67,675);
		
		//take first 5 numbers and sum the 5 five numbers
	Integer sumoffirst5values=	list.stream().limit(5).reduce((a,b)->a+b).get();
System.out.println(sumoffirst5values);
Integer sumoflast5values=	list.stream().skip(5).reduce((a,b)->a+b).get();
System.out.println(sumoflast5values);

	}

}
