package designpattern.decorator;

public class CarWithJBL extends AbstractDecorator {

    public CarWithJBL(Car car) {
       // super(car);
        this.car = car;
    }

    Car car;



    @Override
    public int getCost() {
        System.out.println(" Adding price of JBL");
        return car.getCost() +50;
    }
}
