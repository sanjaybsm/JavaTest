package threads;

/**
 * Created by Sanjay_Shivanna on 12/25/2017.
 */
public class ThreadWaitNotifyExecute {

    public static void main(String[] args) {
        ThreadWaitNotifyExample threadWaitNotifyExample = new ThreadWaitNotifyExample();

        new Thread(){
            @Override
            public void run() {
                threadWaitNotifyExample.withdraw(15000);
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                threadWaitNotifyExample.deposit(10000);
            }
        }.start();
    }
}
