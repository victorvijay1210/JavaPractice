package streams_interviewprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(11,2,3,45,67,9,90,87,8,2,0);
		
   //find even
	List<Integer> even= list.stream().filter(e->e%2==0).collect(Collectors.toList());
	System.out.println("Even number is:"+" "+ even);
	
	//find odd
	List <Integer>odd =list.stream().filter(e->e%2!=0).collect(Collectors.toList());
	System.out.println("Even number is:"+" "+ odd);

	}

}
