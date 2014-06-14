package weatherObservable;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by SiyuanZeng's on 6/14/2014.
 */
//public class HeatIndexDisplay implements Observable, DisplayElement {
public class HeatIndexDisplay implements Observer, DisplayElement {
    float heatIndex = 0.0f;
//    private Subject weatherData;

    public HeatIndexDisplay (Observable observable) {
        observable.addObserver(this);

//        this.weatherData = weatherData;
//        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Heat index is " );
        System.out.println(heatIndex);

    }

    /*    @Override
    public void update(float temp, float humidity, float pressure) {
    public void update(Observable observable) {
        //get the data it wants
        heatIndex = computeHeatIndex(temp, humidity);
        display();
    }*/

    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof  WeatherData) {
            WeatherData weatherData = (WeatherData)observable;
            float t = weatherData.getTemperature();
            float rh = weatherData.getHumidity();
            this.heatIndex = t+rh;
            display();
        }
    }

    /*    private float computeHeatIndex(float temp, float humidity) {
        float process = temp + humidity;
        return process;

    }*/
}
