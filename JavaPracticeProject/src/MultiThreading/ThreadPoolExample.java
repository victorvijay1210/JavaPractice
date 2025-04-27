package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Thread Pool (Executor Framework)
//Instead of creating multiple threads manually, we can use a thread pool.
//✅ Efficient way to manage threads for high-performance applications.


 public class ThreadPoolExample  {
    public static void main(String[] args) {
    	
    	
        ExecutorService executor = Executors.newFixedThreadPool(3); // 3 Threads

        for (int i = 0; i < 5; i++) {
            executor.execute(new CreatingThread2());
        }

        executor.shutdown();
    }
}

