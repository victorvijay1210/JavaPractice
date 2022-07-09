package Abstractiondemo;

public class interfaceimplementaion implements HDFC, SBI {

	
	
	
	
	public static void main(String[] args) {

		interfaceimplementaion implementaion = new interfaceimplementaion();
		implementaion.approveloan();
		implementaion.checkbalance();
		implementaion.minisatement();
		implementaion.transaction();
	
	
	}

	@Override
	public void approveloan() {
		
		System.out.println("CTS");
	}

	@Override
	public void checkbalance() {
		System.out.println("HCL");		
	}

	@Override
	public void minisatement() {
		System.out.println("TCS");
	}

	public void transaction()
	{
		System.out.println("FreahWorks");
	}
}
