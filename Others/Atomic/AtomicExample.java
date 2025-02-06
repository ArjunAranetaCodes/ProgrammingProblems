import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {
    public static void main(String[] args){
        AtomicCounter counter = new AtomicCounter();

        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 1000; i++){
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 1000; i++){
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Final Counter Value: " + counter.getCount());

    }
}

class AtomicCounter {
    private AtomicInteger count = new AtomicInteger(0);

    public void increment(){
        count.incrementAndGet();
    }

    public int getCount(){
        return count.get();
    }
}