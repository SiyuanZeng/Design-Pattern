package weather;

/**
 * Created by SiyuanZeng's on 6/14/2014.
 */
public class HeatIndexDisplay implements Observable, DisplayElement{
    float heatIndex = 0.0f;
    private Subject weatherData;

    public HeatIndexDisplay (WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Heat index is " );
        System.out.println(heatIndex);

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        //get the data it wants
        heatIndex = computeHeatIndex(temp, humidity);
        display();

    }

    private float computeHeatIndex(float temp, float humidity) {
        float process = temp + humidity;
        return process;

    }
}
