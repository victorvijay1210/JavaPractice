package MultiThreading;

//Thread Synchronization (Avoiding Race Conditions)
//✅ synchronized keyword prevents multiple threads from modifying the same variable simultaneously.

class Counter {
    int count = 0;

    synchronized void increment() { 
        count++; 
    }
}

class MyThread extends Thread {
    Counter c;

    MyThread(Counter c) { 
        this.c = c; 
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            c.increment();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        MyThread t1 = new MyThread(c);
        MyThread t2 = new MyThread(c);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count: " + c.count);  // Expected: 2000
    }
}
