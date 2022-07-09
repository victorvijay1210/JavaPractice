package interviewprograms;

public class reversenumber {
	
	
	
	//using while loop
	public void reversingnumber(int number) {
		
		
		while(number>0) {
			int rev = number%10;
			System.out.print(rev);
			number=number/10;
		}
	}
	
	//string buffer
	public void newreverse(int number) {
		
		
		System.out.println(new StringBuffer(String.valueOf(number)).reverse());
		
	}
	
	//recursion
	public void numberreverse(int number) {
		
		if(number<10) {
			System.out.print(number);
			return;
		}
		else {
			System.out.print(number%10);
			numberreverse(number/10);
		}
	}
	
	
	

	public static void main(String[] args) {

		reversenumber rev = new reversenumber();
		//rev.reversingnumber(12345);
		rev.newreverse(12345);
		//rev.numberreverse(12345);
		
	}

}
