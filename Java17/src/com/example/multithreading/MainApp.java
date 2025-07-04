import com.example.multithreading.threadcreation.MyThread;
import com.example.multithreading.threadcreation.MyRunnable;
import com.example.multithreading.sync.Counter;
import com.example.multithreading.producerconsumer.*;
import com.example.multithreading.deadlock.DeadlockExample;

public class MainApp {
    public static void main(String[] args) throws InterruptedException {
        // Thread creation
        Thread t1 = new MyThread();
        Thread t2 = new Thread(new MyRunnable());
        t1.start();
        t2.start();

        // Synchronization
        Counter counter = new Counter();
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });
        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });
        t3.start();
        t4.start();
        t3.join();
        t4.join();
        System.out.println("Final Counter Value: " + counter.getCount());

        // Producer-Consumer
        Buffer buffer = new Buffer();
        Thread producer = new Thread(new Producer(buffer));
        Thread consumer = new Thread(new Consumer(buffer));
        producer.start();
        consumer.start();
        producer.join();
        consumer.join();

        // Deadlock (intentional)
        System.out.println("Starting deadlock example...");
        DeadlockExample.createDeadlock(); // This will hang
    }
}
// Note: The deadlock example will cause the program to hang indefinitely.
// To avoid this, you can comment out the deadlock section when running the program.
// The rest of the code demonstrates thread creation, synchronization, and the producer-consumer problem.