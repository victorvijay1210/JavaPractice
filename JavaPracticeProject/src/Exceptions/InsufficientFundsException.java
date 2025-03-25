package Exceptions;

@SuppressWarnings("serial")
//Step 1: Create a custom unchecked exception
//An unchecked exception is a subclass of RuntimeException and does not require throws or try-catch.

class InsufficientFundsException extends RuntimeException {
 public InsufficientFundsException(String message) {
     super(message);
 }


//Step 2: Use the custom exception in a method
 public static void withdraw(double amount) {
	 
	 double Availablebalance = 5000;

     if (amount > Availablebalance) {
         throw new InsufficientFundsException("Insufficient funds! Available balance: " + Availablebalance);
     }
     Availablebalance -= amount;
     System.out.println("Withdrawal successful! Remaining balance: " + Availablebalance);
 }

 
 

 public static void main(String[] args) {
     withdraw(6000); // Throws InsufficientFundsException
 }
}
