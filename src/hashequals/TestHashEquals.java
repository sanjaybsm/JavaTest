package hashequals;

import java.util.HashMap;

/**
 * Created by Sanjay_Shivanna on 12/30/2017.
 */
public class TestHashEquals {

    public static void main(String[] args) {
        Customer c1 = new Customer(20,"Sanjay");
        System.out.println(c1.hashCode());
        Customer c2 = new Customer(20,"Sanjay");
        System.out.println(c2.hashCode());
        Customer c3 = new Customer(45,"Sanjay");
        Customer c4 = new Customer(20,"sanjay");
        System.out.println(c4.hashCode());

        /*check reflexive*/
        System.out.println("Two objects are equal: "+c1.equals(c2));
        System.out.println("Two objects are not equal : "+c1.equals(c3));

        /*Check case sensitive strings*/
        System.out.println(c1.equals(c4));

        HashMap<Customer,String> map  = new HashMap<>();
        map.put(c1,"C1");
        /*c2 should replace c1 since both the objects are equal*/
        map.put(c2,"C2");
        map.put(c3,"C3");
        map.put(c4,"C4");

        map.forEach((k,v) -> System.out.println("key "+k+"value"+v));

        System.out.println("Get "+map.get(c2));
        /*Note c2 and c4 will be mapped in same bucket since the hascode is same but they are not equal*/
        /*2 object may have same hashcode but may not be equal*/
        System.out.println("Get "+map.get(c4));

    }
}
