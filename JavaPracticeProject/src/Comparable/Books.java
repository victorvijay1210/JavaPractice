package Comparable;

public class Books implements Comparable<Books>{
	
	int price;
	String bookName;
	
	public Books(int price,String bookName) {
		this.bookName=bookName;
		this.price=price;
	}
	
	
	@Override
	public int compareTo(Books other) {
		// TODO Auto-generated method stub
		return this.price-other.price;
	}
	
	public String toString() {
		return bookName +"="+ price;
		
	}

}
