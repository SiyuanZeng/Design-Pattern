/**
 * Created by SiyuanZeng's on 6/8/2014.
 */
public class Expresso extends Beverage {
    public Expresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
