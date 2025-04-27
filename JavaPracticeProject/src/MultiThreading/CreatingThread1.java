package MultiThreading;


//We can create Thread  by extending Thread class
public class CreatingThread1  extends Thread{


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreatingThread1 ct = new CreatingThread1();
		ct.start();
		ct.interrupt();
		
	}

}
