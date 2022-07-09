package classdemo;

//instance variable is also called global variable
//example of instance variable with constructor


public class instancevariable {

	int vijay;
	double ajay;
	
	
	
	public instancevariable(int vijay,double ajay ) {
		
	this.ajay= ajay;
	this.vijay=vijay;
	}
	
	
	
	
	public void testing() {
		
	int x =20;
	System.out.println("Value of x is" + x);
	
	}
	
	
	public static void main(String[] args) {

		instancevariable variable1 = new instancevariable(10,5000);
		variable1.testing();
		instancevariable variable2 = new instancevariable(12,6000);
		variable2.testing();
		instancevariable variable3 = new instancevariable(14,8000);
		variable3.testing();
		
			
	}

}
