package threads;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by Sanjay_Shivanna on 12/25/2017.
 */
public class ThreadPoolExample implements Runnable {


    @Override
    public void run() {
        System.out.println("Thread started "+Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thred End"+Thread.currentThread().getName());

    }

    public static void main(String[] args) {

        Executor executor = Executors.newFixedThreadPool(5);

        /*10 instance were created but Thread pool will handle the request with Thread pool*/
        for (int i = 0; i < 10; i++) {
            ThreadPoolExample pl = new ThreadPoolExample();
             executor.execute(pl);
        }

        //other wise 10 thread needs to be executed to process the taks or manually maintain the thread pool
    }


}
