/**
 * Created by SiyuanZeng's on 6/9/2014.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
