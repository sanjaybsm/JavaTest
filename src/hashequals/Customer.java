package hashequals;

/**
 * Created by Sanjay_Shivanna on 12/30/2017.
 */
public class Customer {

    public Customer(int age, String name) {
        this.age = age;
        this.name = name;
    }

    int age;
    String name;

    @Override
    public boolean equals(Object obj) {

        if(obj instanceof Customer){
            Customer cust = (Customer)obj;
            return this.age == cust.age && this.name.equals(cust.name);
        }
         return false;
    }

    @Override
    public int hashCode() {
        int randomevalue = 17;
        randomevalue = 31 * randomevalue * this.age;
        return randomevalue;
    }
}