package Constructor;

//Default Constructor Example
public class Car {
	
	
	Car(){
	System.out.println("The car name is TATA");	
	}
	
	public void anotherCar(){
		System.out.println("The car name is KIA");	
		}
	
	public static void main(String[] args) {
		
		Car car = new Car();// By Default call Default Constructor
		
		car.anotherCar();
	}

}
