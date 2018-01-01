package designpattern.depdencyinjection;

/**
 * Created by Sanjay_Shivanna on 12/28/2017.
 */
public interface iMessageInjector {

    iMessageSender getConsumer();
}
