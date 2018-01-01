package oops;

import org.jetbrains.annotations.Contract;

/**
 * Created by Sanjay_Shivanna on 1/1/2018.
 */
public class TestExamples {

    public static void main(String[] args) {
        AbstractIndianName name = new AbstractIndianName() {
            @Contract(value = " -> null", pure = true)
            @Override
            public String RegionalName() {
                return null;
            }
        };

        /*The following annonmys class is as good as concrete class*/
        System.out.println(new AbstractIndianName(){

            public String RegionalName(){
                return  "Karnataka name";
            }
        }.RegionalName());
    }
}
