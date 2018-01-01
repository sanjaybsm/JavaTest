/**
 * Created by Sanjay_Shivanna on 12/31/2017.
 */
public class TestFinal {

    public TestFinal(int a) {
        this.a = a;
    }

    /*you will have to initialise the final key in constructor or initialise with a value that can't be changed*/
    public final int a;

    /*Compilation error - you can't reassing value to final */
   /* public void modifyfinal(int value){
        this.a = value;
    }*/

    /*Final classes can't be extended and final method can't be overriden*/


}
