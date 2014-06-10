/**
 * Created by SiyuanZeng's on 6/9/2014.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage){
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
