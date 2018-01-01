package designpattern.depdencyinjection;

/**
 * Created by Sanjay_Shivanna on 12/28/2017.
 */
public class EmailMessageSender implements iMessageSender {
    @Override
    public void sendMessages(String Name, String address) {
        System.out.println("Sending Email"+Name+"address"+address);
    }
}
