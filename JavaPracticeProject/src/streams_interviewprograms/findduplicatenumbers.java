package streams_interviewprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class findduplicatenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> list = Arrays.asList(2,2,55,78,2,55,10,22,20,10,67);
		
		//using frequency approch
		Set<Integer> dup =list.stream().filter(e->Collections.frequency(list, e)>1).collect(Collectors.toSet());
		System.out.println(dup);
        
		//usinghashset
		  HashSet<Integer> set = new HashSet<Integer>();
		  Set<Integer> dupset=	 list.stream().filter(e->!set.add(e)).collect(Collectors.toSet());
		System.out.println(dupset);
	}

}
