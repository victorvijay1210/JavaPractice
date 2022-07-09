package interviewprograms;

public class factorial {

	//factorial of 4 = 4*3*2*1
	//factorial of 1=1
	//factorial of 0=1
	
	
	//using for loop to calculate factorial
	
	public static int factorials(int number) {
		
		int fact = 1;
		
		if(number ==0) {
			return 1;
		}
		else {
			for(int i=1;i<=number;i++) {
				fact=fact*i;
				
			}
			return fact;
		}
		
	}
	
	
//using recursive function
	
	public static int fact(int number) {
		
		
		if(number==0) {
			return 1;
		}
		else {
			return (number *(fact(number-1)));
		}
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println(factorials(3));
		System.out.println(fact(3));
		System.out.println(factorials(0));
		System.out.println(fact(0));

	}

}
