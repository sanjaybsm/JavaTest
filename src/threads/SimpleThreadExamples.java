package threads;

/**
 * Created by Sanjay_Shivanna on 12/25/2017.
 */
public class SimpleThreadExamples implements  Runnable {


    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("i"+i+"Thread Tasks "+Thread.currentThread().getName());

        }

    }


    public static void main(String[] args) {
        SimpleThreadExamples simple1 = new SimpleThreadExamples();

        Thread t1 = new Thread(simple1);
        Thread t2 = new Thread(simple1);

      //  t1.start();
       //  t1.start(); will give exception
        //When we include join then t2 will wait till t1 completes it's task.
        /*try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
      //  t2.start();

        /*if we call run method then no separate thread is started !!*/

       // t1.run();
       // t2.run();
    }


}
