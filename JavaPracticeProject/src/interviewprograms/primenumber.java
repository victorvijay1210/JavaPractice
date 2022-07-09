package interviewprograms;

public class primenumber {

     //prime number should be greater than 1
	//prime number is where its divided by 1 and that same number is called prime number (have to get 2 factorial not more then that)
	//prime number examples 2, 3,5,7...
	//Not a prime numbers are 4,6,8,10....
	
	
	public static void main(String[] args) {

		int number=3;
		int count=0;
		
		if(number>1) {
			
			for(int i=1; i<=4;i++) {
				
				if(number %i==0) {
					count++;
				}
			}
				if(count==2) {
					System.out.println("number is a prime number");

				}
				
				else {
					System.out.println("number is not a prime number");

				}
			}
		
		
		
		else {
			System.out.println("number is not a prime number");
		}
		
	}

}
