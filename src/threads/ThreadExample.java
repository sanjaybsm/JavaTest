package threads;

/**
 * Created by Sanjay_Shivanna on 12/25/2017.
 */
public class ThreadExample {
    public static void main(String[] args) {
        ThreadSynchExample threadSynchExample = new ThreadSynchExample();

        /*same object theradsynchexample is shared with 2 threads*/
        /*When the method is not synchronised the results are random i.e. values printed are random for each thread */
        Thread t1 = new Thread(new Mythread(threadSynchExample));
        Thread t2 = new Thread(new Mythread1(threadSynchExample));

        t1.start();
        t2.start();



    }
}
