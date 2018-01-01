package designpattern.strategy;

/**
 * Created by Sanjay_Shivanna on 1/1/2018.
 */
public class DelhiBirthNameStrategy implements iBirthName {
    @Override
    public String printBirthName() {
        return "[Delhi Names] Saurabh,Agrawal,Malotra..";
    }
}
