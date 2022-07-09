package Superkeyworddemo;

public class constractorchild extends constractorparent {

	
	
	public constractorchild() {
		
		 System.out.println("This is Ajay");
	}
	
	
	public constractorchild(String name) {
		
		super(name);
		 System.out.println("The name is"+ name);
	}
	
	
	
	public static void main(String[] args) {

		constractorchild child = new constractorchild("kumar");
		
		
	}

}
