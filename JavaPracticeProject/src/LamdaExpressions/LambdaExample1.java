package LamdaExpressions;

public class LambdaExample1{
    public static void main(String[] args) {
        // Traditional way
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, World!");
            }
        };

        // Lambda expression (concise version)
        Runnable r2 = () -> System.out.println("Hello, World!");

        r1.run();  // Calling the run() method using traditional approach
        r2.run();  // Calling the run() method using lambda
        
        
        
    }
}