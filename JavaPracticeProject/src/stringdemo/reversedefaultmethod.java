package stringdemo;

public class reversedefaultmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String st1 = "Automation";
		
		String rev ="";
		
		for(int i=st1.length()-1; i>=0;i--) {
			  
			rev = rev + st1.charAt(i);
		}
		

		System.out.println(rev);
		
		
		
	}

}
