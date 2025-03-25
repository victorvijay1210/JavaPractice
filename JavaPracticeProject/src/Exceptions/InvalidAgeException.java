package Exceptions;

//Step 1: Create a custom checked exception

//A checked exception must be handled using try-catch or declared using throws.


class InvalidAgeException extends Exception {	
 public InvalidAgeException(String message) {
     super(message);
 }


//Step 2: Use the custom exception in a method
 public static void validateAge(int age) throws InvalidAgeException {
     if (age < 18) {
         throw new InvalidAgeException("Age must be 18 or above.");
     }
     System.out.println("Valid age!");
 
 }
 
 
 public static void main(String[] args) {
     try {
         validateAge(16); // Throws InvalidAgeException
     } catch (InvalidAgeException e) {
         System.out.println("Exception caught: " + e.getMessage());
     }
 }
}
