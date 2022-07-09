import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class duplicatecheck {

	public static void main(String[] args) {

		
		
		Map<String,String> map=new HashMap<String, String>();
		map.put("Agila", "100");
		map.put("Vijay", "200");
		map.put("Ajay", "100");
		map.put("manish", "300");
		map.put("Vickey", "100");
	
		
		System.out.println("Duplicate values");
Map<String, Long>values=	map.values().stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
		System.out.print(values);
//Iterator<Entry<String, String>> it	=map.entrySet().iterator();
//	
//System.out.println("hashmap itration");
// while (it.hasNext()) {
//	
//	Entry<String,String> entry= it.next();
//
//	System.out.println("Key=" + entry.getKey() +"  " + "Value=" + entry.getValue()  );
//

	
// }

 
 
		
	}

	

}
