package Arraydemo;

public class whilelooparrayddemo {

	public static void main(String[] args) {
		
		
		

		int student_mark []=new int[6];
		
		student_mark [0]=10;
		student_mark [1]=20;
		student_mark [2]=30;
		student_mark [3]=40;
		student_mark [4]=50;
		student_mark [5]=60;
		
		int student_name = student_mark.length;
		
		System.out.println("Total marks are"+student_name);
		
		
		
		while(student_name<7) {
			
			System.out.println("Total marks are"+student_mark[5]);
			break;
		}
	}

}
