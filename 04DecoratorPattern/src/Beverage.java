/**
 * Created by SiyuanZeng's on 6/8/2014.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();


}
