package designpattern.depdencyinjection;

/**
 * Created by Sanjay_Shivanna on 12/28/2017.
 */
public class TestDI {

    public static void main(String[] args) {
        /*Need additional contract for Injector*/
        iMessageSender  messageSender  = new EmailInjector().getConsumer();
        messageSender.sendMessages("Sanjay","Email");


        //SMS
        messageSender = new SMSInjector().getConsumer();
        messageSender.sendMessages("Sanjay","SMS");


        /*Check google GUICE library to implement DI pattern*/
    }
}
