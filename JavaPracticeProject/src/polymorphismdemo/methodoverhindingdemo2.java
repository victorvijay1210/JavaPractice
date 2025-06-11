package polymorphismdemo;

//Run-Time Polymorphism
public class methodoverhindingdemo2 extends methodoverhindingdemo1 {
	
  public void adding(int b) {
		
		System.out.println(b);
	}
	

	public static void main(String[] args) {

		methodoverhindingdemo2 demo2 = new methodoverhindingdemo2();
		
		demo2.adding(100);
		
		methodoverhindingdemo1 demo1 = new methodoverhindingdemo1();
		
		demo1.adding(60);
		
		
	}

}
