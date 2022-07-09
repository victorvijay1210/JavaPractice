
public class demo {

	
	
	
	public void cal() {
		
	int a =10;
	int b= 20;
	int c = a+b;
	
	System.out.println(c);
	
	}

	public void stringcompare() {
		
		String st1= "This is victor vijay";
		String st2= "This is victor vijay";
	
		
		if (st1.equalsIgnoreCase(st2)) {
			
			System.out.println("Test case passed");
		}
		
		else {
			System.out.println("Test case failed");
		}
	}
	
	
	public static void main (String[]args) {
		
		demo dm = new demo();
		
		dm.cal();
		dm.stringcompare();
		
	}
	
	
}
