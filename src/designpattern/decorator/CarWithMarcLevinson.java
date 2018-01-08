package designpattern.decorator;

public class CarWithMarcLevinson extends AbstractDecorator {

    public CarWithMarcLevinson(Car car) {
       // super(car);
        this.car = car;
    }

    @Override
    public int getCost() {
        System.out.println("added price of MarcLevinson");
        return car.getCost() + 25;
    }

    Car car;


}
