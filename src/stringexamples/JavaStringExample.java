package stringexamples;

/**
 * Created by Sanjay_Shivanna on 12/23/2017.
 */
public class JavaStringExample {

    public static void main(String[] args) {

        String s = "sanjay";
        String sobj = new String("sanjayobj");
        new JavaStringExample().modifyString(sobj);
        System.out.println(sobj);
    }


    public void modifyString(String s){
        System.out.println("modified string "+(s+"add"));
    }
}
