package designpattern.decorator;

public abstract class AbstractDecorator implements Car {

  /*  public AbstractDecorator(Car car) {
        this.car = car;
    }

    Car car;*/

    @Override
    public abstract int getCost();
}
