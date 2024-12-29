import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
    public static void main(String[] args) {
        // Create a CyclicBarrier for 5 threads
        CyclicBarrier barrier = new CyclicBarrier(5, new Runnable() {
            @Override
            public void run() {
                // This task will be executed once all threads reach the barrier
                System.out.println("All threads have reached the barrier. Continuing execution...");
            }
        });

        // Create and start 5 threads
        for (int i = 1; i <= 5; i++) {
            Thread worker = new Thread(new Worker(barrier, i));
            worker.start();
        }
    }
}

class Worker implements Runnable {
    private CyclicBarrier barrier;
    private int id;

    public Worker(CyclicBarrier barrier, int id) {
        this.barrier = barrier;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread " + id + " is performing its task.");
            // Simulate task execution with sleep
            Thread.sleep((long) (Math.random() * 3000));
            System.out.println("Thread " + id + " has finished its task and is waiting at the barrier.");

            // Wait at the barrier
            barrier.await();

            // Continue execution after all threads reach the barrier
            System.out.println("Thread " + id + " is resuming execution.");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
