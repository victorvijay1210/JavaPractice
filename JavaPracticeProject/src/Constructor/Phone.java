package Constructor;

//Constructor OverLoading
public class Phone {
	String str;
	
	public Phone() {
	 System.out.println("Phone name is Redmi");	
	}
	
	public Phone(String str) {
		 this.str=str;
	}
	
	public void phoneDisplay() {
		
		System.out.println("Phone name is"+" "+str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Phone phone = new Phone("OnePlus");//Calls parameterized constructor
        Phone phonename = new Phone();//Calls default constructor
        phone.phoneDisplay();
	}

}
