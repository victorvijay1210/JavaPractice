package StringLitrals;

public class demo {

	
	
	
	
	public static void main (String[]args) {
	 String str1="Victor";
	 String str2="Victor";
	 System.out.println(str1==str2);
//	 prints true because both str1 and str2 refer to the same string object in the string pool.
//	 Reason: String Pool in Java
//	 In Java, string literals are stored in a special memory area called the String Pool to optimize memory usage.
//	 Step-by-Step Explanation:
//	 String str1 = "Victor";
//	 Since "Victor" is a string literal, it is stored in the string pool.
//	 str1 points to this "Victor" object in the pool.
//	 String str2 = "Victor";
//	 The JVM sees that "Victor" already exists in the string pool.
//	 Instead of creating a new object, str2 is assigned the same reference as str1.
//	 str1 == str2 checks reference equality.
//	 Since both variables point to the same object in the pool, str1 == str2 returns true.
	 
	 String st1 = new String("Victor");
	 String st2 = new String("Victor");
	 System.out.println(st1==st2);
// If we explicitly create a new string object, the result would be different
//prints false, Here two different objects are created in heap memory, so str1 and str2 have different references.
	}
	
	
}
