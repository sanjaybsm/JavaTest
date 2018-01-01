package designpattern.depdencyinjection;

/**
 * Created by Sanjay_Shivanna on 12/28/2017.
 */
public class SMSMessageSender implements iMessageSender {


    @Override
    public void sendMessages(String Name, String address) {
        System.out.println("SMS Message sender "+Name+"adderess"+address);
    }
}
