package threads;

public class ProducerConsumerMain {

    public static void main(String[] args) {

        ProducerConsumer instance = new ProducerConsumer();

        Thread producer = new Thread(() -> instance.producer());

        Thread consumer = new Thread(() -> instance.consumer());

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }




    }
}
