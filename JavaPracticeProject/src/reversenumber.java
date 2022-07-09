
public class reversenumber {
	
	
	
	public static void reverse(int number) {
		
		 
		while(number>0) {
			
			int rev = number%5;
			
		
			System.out.print(rev);
			number=number/5;
		}
		
		
	}

	public static void main(String[] args) {
		
		reverse(12345);
		
	
		
	}

}
