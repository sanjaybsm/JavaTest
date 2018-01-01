import designpattern.builder.Person;

import static java.util.UUID.randomUUID;

/**
 * Created by Sanjay_Shivanna on 12/25/2017.
 */
public class TestExamples {

    public static void main(String[] args) {

      //  RestrictInstanceExample res = new RestrictInstanceExample();

        RestrictInstanceExample instanceExample = RestrictInstanceExample.getInstance();

        /*Builder Pattern example*/
        Person person = new Person.PersonBuilder(10,20).buildPerson();

        /*Example of values*/
        System.out.println("age"+person.getAge()+"size"+person.getSize()+"hieght"+person.getHieght());


        /*java UUID example*/
        System.out.println(randomUUID());
    }
}




