package designpattern.decorator;

public class BaseCar implements Car {

    int price = 100;
    @Override
    public int getCost() {
        System.out.println("Base car price");
        return 100;
    }
}
