/**
 * Created by SiyuanZeng's on 6/9/2014.
 */
public class Milk extends CondimentDecorator {
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }

}
