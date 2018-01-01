package threads;

/**
 * Created by Sanjay_Shivanna on 12/25/2017.
 */
public class ThreadWaitNotifyExample {

    private int amount = 10000;

    public synchronized void  withdraw(int withdraw){
        if(this.amount > withdraw) {
            this.amount = this.amount - withdraw;
            System.out.println("Amount in the account" + amount);
        }else{
            System.out.println("No balance");
            try {
                wait(); //wait for amount to deposit
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.amount = this.amount - withdraw;
            System.out.println("Amount in the account after wait" + amount);
        }
    }

    public synchronized void deposit(int deposit){
        this.amount = this.amount + deposit;
        System.out.println("current balance "+this.amount);
        notify();
    }

}
