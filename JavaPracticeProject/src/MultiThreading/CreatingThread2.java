package MultiThreading;

//We can create thread by implementing Runnable interface
public class CreatingThread2 implements Runnable{
	
	@Override
	public void run() {
   System.out.println("Thread is running");	
   System.out.println("Executing task in: " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       Thread td = new Thread(new CreatingThread2());
       td.start();
       td.interrupt();
       
		
	}

	

}
