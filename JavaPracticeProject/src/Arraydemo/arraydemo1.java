package Arraydemo;

public class arraydemo1 {

	public static void main(String[] args) {

		int student_mark []=new int[6];
		String student_name[]=new String[2];
		
		student_mark [0]=10;
		student_mark [1]=20;
		student_mark [2]=30;
		student_mark [3]=40;
		student_mark [4]=50;
		student_mark [5]=60;
		
		student_name [0]="suriya";
		student_name [1]="vijay";
		
	    int students= student_name.length;
		
		int student_name1 = student_mark.length;
		
		System.out.println("Total marks are"+student_name);
		
		int i;
		for(i=0;i<student_name1;i++) {
			
			System.out.println("Total marks is"+student_mark[i]);
		}
		
	

	for(int j=0;j<students;j++) {
		System.out.println("Total name is"+student_name[j]);
		
	}
}
}