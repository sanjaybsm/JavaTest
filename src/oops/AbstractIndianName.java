package oops;

/**
 * Created by Sanjay_Shivanna on 1/1/2018.
 */
public abstract class AbstractIndianName implements iName  {

    public abstract String RegionalName();

    @Override
    public String birthName() {
        return "Indian Name";
    }
}
