package streams_interviewprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>list = Arrays.asList(100,20,300,40,500,6);
	//sort	
	List<Integer>sort=list.stream().sorted().collect(Collectors.toList());
    System.out.println(sort);
    
    //reverse sort
    List<Integer>revsort=list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
    		 System.out.println(list);
	}

}
