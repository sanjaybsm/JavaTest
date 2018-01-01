package designpattern.strategy;

/**
 * Created by Sanjay_Shivanna on 1/1/2018.
 */
public class ConcreateNamePrinter {

    public static void main(String[] args) {

        /*Concreate strategy haven invoked by client depending upon the requirement*/
        iBirthName birthName = new KarnatakaBirthNameStrategy();
        System.out.println(birthName.printBirthName());
        birthName = new DelhiBirthNameStrategy();
        System.out.println(birthName.printBirthName());
    }
}
