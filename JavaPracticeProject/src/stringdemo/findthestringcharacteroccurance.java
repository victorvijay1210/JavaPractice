package stringdemo;

public class findthestringcharacteroccurance {
	
	

	//using charA()
public static void getcountofcharacter(String str, char val)	{
	

	
	int count = 0;
	for(int i=0; i<str.length()-1;i++) {
		
		if(str.charAt(i)==val) {
			count++;
		}
	}
	
	System.out.println(val +":"+ count);
	
}
	
	
//using tochararry()
public static void gettheoccuranceofcharacter(String str, char val) {
	int count =0;
	
	for(char ch :str.toCharArray()) {
		
		if(ch==val) {
			count++;
		}
		
	}
	System.out.println(val +":"+ count);

}
	
	
	
	
	


	public static void main(String[] args) {
		String str = "Automation Test Engineer";
		String str1 = str.toLowerCase();
    getcountofcharacter(str1, 't');		
	gettheoccuranceofcharacter(str1, 'e');	

	}

}
