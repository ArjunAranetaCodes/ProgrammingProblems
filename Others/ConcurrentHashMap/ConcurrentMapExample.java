import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapExample {
    public static void main(String[] args){
        ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();

        Runnable task = () -> {
            for(int i = 0; i < 5; i++){
                concurrentMap.put(Thread.currentThread().getName() + i, i);
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        // Wait for threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Display the contents of the map
        concurrentMap.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}