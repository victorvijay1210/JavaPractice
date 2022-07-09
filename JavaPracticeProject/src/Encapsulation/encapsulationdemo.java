package Encapsulation;

public class encapsulationdemo {

	private int aaa;
	private String bbb;
	private int ccc;
	
	
	
	
	
	public int getAaa() {
		return aaa;
	}





	public void setAaa(int aaa) {
		this.aaa = aaa;
	}





	public String getBbb() {
		return bbb;
	}





	public void setBbb(String bbb) {
		this.bbb = bbb;
	}





	public int getCcc() {
		return ccc;
	}





	public void setCcc(int ccc) {
		this.ccc = ccc;
	}





	public static void main(String[] args) {

		encapsulationdemo demo = new encapsulationdemo();
		demo.setAaa(100);
		demo.setBbb("vijay");
		demo.setCcc(90);
		
		System.out.println(demo.getAaa());
		System.out.println(demo.getBbb());
		System.out.println(demo.getCcc());
		
	}

}
