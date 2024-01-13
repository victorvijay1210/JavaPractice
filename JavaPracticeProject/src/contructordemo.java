
public class contructordemo {

	static int marks;
	
	
	
	
	public contructordemo(int rank){
		
		marks=rank;
	}
	
	public static void demonew()
	{
		System.out.println("the demonew value is"+marks);
	}
	
	

	public static void main(String[] args) {
		contructordemo con = new contructordemo(100);
        demonew();
	}

}
