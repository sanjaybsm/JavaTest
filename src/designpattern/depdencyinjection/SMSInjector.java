package designpattern.depdencyinjection;

/**
 * Created by Sanjay_Shivanna on 12/28/2017.
 */
public class SMSInjector implements iMessageInjector {
    @Override
    public iMessageSender getConsumer() {
        return new SMSMessageSender();
    }
}
