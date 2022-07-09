package polymorphismdemo;

public class methodoverloadingdemo {


	
	public void function(String a) {
		System.out.println(a);
	}
	
	
	public void function(int b) {
		System.out.println(b);
	}
	
	
	
	public static void main(String[] args) {

		
		methodoverloadingdemo loading = new methodoverloadingdemo();
		
		loading.function(50);
		loading.function("vijay");
		
	}

}
