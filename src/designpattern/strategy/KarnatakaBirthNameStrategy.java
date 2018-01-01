package designpattern.strategy;

/**
 * Created by Sanjay_Shivanna on 1/1/2018.
 */
public class KarnatakaBirthNameStrategy implements iBirthName {

    /*Karnatak specific names will be printed*/
    @Override
    public String printBirthName() {
        return "[Karnataka Names] Sanjay,Vijaya,Rishita... ";
    }
}
