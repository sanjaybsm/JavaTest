package designpatter;

/**
 * Created by Sanjay_Shivanna on 12/25/2017.
 */
public class Person {

    public int getAge() {
        return age;
    }

    public int getSize() {
        return size;
    }

    public int getHieght() {
        return hieght;
    }

    public int getWieght() {
        return wieght;
    }

    /*Mandatory parameter*/
    private int age;
    private int size;


    /*Optional paramater*/
    private int hieght;
    private int wieght;


    /*Private constructor so that instantiation can be avoided */
    private Person(PersonBuilder builder) {
        this.age = builder.age;
        this.size = builder.size;
        this.hieght = builder.hieght;
        this.wieght = builder.wieght;
    }


    public static class PersonBuilder {

        /*Mandatory parameter*/
        private int age;
        private int size;

        /*Optional paramater*/
        private int hieght;
        private int wieght;

       public PersonBuilder(int age,int size){
           this.age = age;
           this.size = size;
       }

        public PersonBuilder setHieght(int hieght){
            this.hieght = hieght;
            return  this;
        }

        public PersonBuilder setWieght(int wieght){
            this.wieght = wieght;
            return this;
        }

        public Person buildPerson(){
           return  new Person(this);
        }

    }

}
