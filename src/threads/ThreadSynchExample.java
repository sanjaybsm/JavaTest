package threads;

/**
 * Created by Sanjay_Shivanna on 12/25/2017.
 */
class ThreadSynchExample {


    /*Synchronised method example - when same object is shared with Threads then due synchronisation Threas accessing
     This mehtod should first acquire lock before executing this method*/
    public synchronized void  printValues(int value){
        for (int i = 1; i < 6 ; i++) {
            System.out.println(i*value);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class Mythread implements Runnable{

    ThreadSynchExample threadSynchExample;

    public Mythread(ThreadSynchExample threadSynchExample) {
        this.threadSynchExample = threadSynchExample;
    }

    @Override
    public void run() {
        threadSynchExample.printValues(1);
    }
}

class Mythread1 implements Runnable{

    ThreadSynchExample threadSynchExample;

    public Mythread1(ThreadSynchExample threadSynchExample) {
        this.threadSynchExample = threadSynchExample;
    }

    @Override
    public void run() {
        threadSynchExample.printValues(10);
    }
}



