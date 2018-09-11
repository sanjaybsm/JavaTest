package threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;

public class ProducerConsumerWithBlockingQueue {


    public static void main(String[] args) {
        BlockingDeque<String> managerQueue = new ArrayBlockingQueue<String>();

        new Thread(new Producer(managerQueue)).start();

        new Thread(new Consumer(managerQueue)).start();

    }



}


class Producer implements Runnable {

    BlockingDeque<String> queue;


    public Producer(BlockingDeque<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            queue.add("Produced " + i);
        }

        queue.put("End");
    }


}

class Consumer implements Runnable {

    BlockingDeque<String> queue;


    public Consumer(BlockingDeque<String> queue) {
        this.queue = queue;
    }


    @Override
    public void run() {

        while(queue.contains("END")){
            try {
                System.out.println("Consumer << "+queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}






