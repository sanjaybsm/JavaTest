package designpattern.decorator;

public class TestDecorator {

    public static void main(String[] args) {
        Car mycar = new CarWithJBL(new CarWithMarcLevinson(new BaseCar()));
        System.out.println(mycar.getCost());
    }
}
