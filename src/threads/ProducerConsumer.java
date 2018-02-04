package threads;

import java.util.LinkedList;

public  class ProducerConsumer {

    LinkedList<Integer> linkedList = new LinkedList<>();
    static  int capacity = 3;


    public void producer(){
        int value = 0;

        while (true) {

            synchronized (this) {
                if (linkedList.size() == capacity) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("Adding value "+value);
                linkedList.add(value++);

                notify();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        }
    }

    public void consumer(){

        while (true) {
            synchronized (this) {

                if (linkedList.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }



                System.out.println("Removed value" + linkedList.removeFirst());

                notify();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        }
    }



}


