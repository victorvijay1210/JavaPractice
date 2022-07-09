package Superkeyworddemo;

public class childclass extends baseclass  {
	
	
	int int_rate=10;
	
	
	public void bankinterst() {
		
		System.out.println("The interst needs to pay on every month" + int_rate);
		//System.out.println("The interst needs to pay on every month" + super.int_rate );
	
	super.loan();
	}

     public void loan() {
		
		System.out.println("Loan amount will be debeted on 10 day of month");
	}
	
	public static void main (String[] args) {
		
		childclass child = new childclass();
		child.bankinterst();
	}
	
	
}
