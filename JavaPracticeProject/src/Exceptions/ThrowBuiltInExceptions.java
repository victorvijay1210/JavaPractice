package Exceptions;

public class ThrowBuiltInExceptions {
	
    //IllegalArgumentException
	public static void validateAge(int age) {
		
		if(age<18) {
			throw new IllegalArgumentException("The age is less than 18");
		}
	
	}
	
	//Null Pointer Exceptions
	public static void validateNullPointer(String str) {
		
		if(str==null) {
			throw new NullPointerException("String cannot be null");
		}
		
		System.out.println("String Length"+str.length());
	}
	
	//IndexOutOfBoundsException
	public static void validatearrayIndexOutOfBoundException(int[] nums, int index) {
		
		if(nums.length<index) {
			 throw new IndexOutOfBoundsException("Cannot access this index");
		}
		
	}
	
	//Arithmetic Exception
	public static void validateArithmathicException(int a, int b) {
		
		if(b==0) {
			throw new ArithmeticException("Value cannot be zero");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       validateAge(12);
       
       validateNullPointer(null);
       
       validatearrayIndexOutOfBoundException(new int[] {1,2,3},5);
       
       validateArithmathicException(4, 0);
	}

}
