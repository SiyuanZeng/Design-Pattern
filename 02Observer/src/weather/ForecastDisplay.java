package weather;

/*
built-in
import javafx.beans.*;
*/

/**
 * Created by SiyuanZeng's on 6/14/2014.
 */
public class ForecastDisplay implements Observable, DisplayElement{
    private float currentPressure = 29.92f;
    private float lastPressure;
    private Subject weatherData;

    public ForecastDisplay (WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast:");
        if (currentPressure > lastPressure){
            System.out.println("Improving wather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure){
            System.out.println("Watch out for cooler, rainy weather");
        }

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }
}
