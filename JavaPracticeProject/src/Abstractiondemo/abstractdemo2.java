package Abstractiondemo;

public  class abstractdemo2 extends abstractdemo{
	
	
	

	public static void main(String[] args) {

		abstractdemo2 abdem = new abstractdemo2();
		
		abdem.add();
		abdem.sub();
		abdem.div();
		abdem.multiple(70);
	
	}

	@Override
	void add() {
		System.out.println("Hi vijay");
	}

	@Override
	void sub() {
		System.out.println("Hi Ajay");
	}

	
	public void div() {
		
		System.out.println("Hi Manish");
	}
}
