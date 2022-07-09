package stringdemo;

public class demostring {

	public static void main(String[] args) {

		String variable ="Victor/vijay/is/a/good boy";
		
		String[] ab =variable.split("/");
		
	  	
    for (int i = 0;i<ab.length;i++) {
    	
      System.out.println("The result is"+i + ab[i]);
    }
	
	
	}

}
