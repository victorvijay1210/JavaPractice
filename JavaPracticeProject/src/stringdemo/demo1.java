package stringdemo;

public class demo1 {

	public static void main(String[] args) {


		String item1 ="Victor vijay is a good boy";
		
		String item2 ="vijay is bad boy";
		
		String item3 = " Victor Vijay ";
		
	boolean B1 = item1.contains("vijay");
	
	boolean B2 = item1.equalsIgnoreCase(item2);
	
	String S1= item3.trim();
	
	
	System.out.println("Result for B1 is" + B1);
	System.out.println("Result for B2 is" + B2);		
	System.out.println("Result for S1 is" + S1);		
			
	
		
	}

}
