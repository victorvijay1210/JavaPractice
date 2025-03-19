package Constructor;

//Parameterized Constructor 
public class Bike {
	
	String str;
	
	 public Bike(String str) {
		this.str=str;
	}
	 
	public void bikeDisplay() {
		System.out.println("Bike name is"+" "+ str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Bike bike = new Bike("R15");
       bike.bikeDisplay();
	}

}
