package thiskeyword;

public class thiskeywordvarialbedemo {

	
	int x;
	int y;
	
	
	public thiskeywordvarialbedemo(int x, int y) {
	this.x=x;
	this.y=y;
		
	}
	
	public void calc() {
		
		int sum = x + y;
		
		System.out.println("total value is"+ sum);
	}
	
	public static void main(String[] args) {

		thiskeywordvarialbedemo demo = new thiskeywordvarialbedemo(50, 50);
		demo.calc();
	}

}
