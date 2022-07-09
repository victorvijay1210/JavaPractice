package Wrapperclass;

public class wrapperclassdemo1 {

	public static void main(String[] args) {

		String st1 = "100";
		
		String st2= "200";
		
		String st3="595.87";
		
		String st4="655.99";
				
		
		
	int P1=Integer.parseInt(st1);
		
	int P2=Integer.parseInt(st2);

    double P3=Double.parseDouble(st3);
	
	double P4=Double.parseDouble(st4);
	
	int sum1= P1+P2;
	
	double sum2= P3+P4;
		
		System.out.println("Total valueis "+sum1);
		
		System.out.println("Total valueis "+sum2);
		
	}

}
