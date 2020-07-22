package algorithms;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable {

    private BlockingQueue<String> queue;

    public Producer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            queue.put("a");
            Thread.sleep(1000);
            queue.put("b");
            Thread.sleep(5000);
            queue.put("c");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}

class Consumer implements Runnable {

    private BlockingQueue<String> queue;

    public Consumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            System.err.println(queue.take());
            System.err.println(queue.take());
            System.err.println(queue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

public class MQ {

    public static void main(String[] args) {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(1024);

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        new Thread(producer).start();
        new Thread(consumer).start();
       
    }
}