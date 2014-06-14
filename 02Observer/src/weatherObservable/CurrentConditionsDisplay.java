package weatherObservable;

import weather.*;
import weather.Subject;

import java.util.*;
import java.util.Observable;

/**
 * Created by SiyuanZeng's on 6/14/2014.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    Observable observable; // still need the Observable;

    /*private Subject weatherData;*/

    public CurrentConditionsDisplay (Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {

        System.out.println("Current conditions: ");
        System.out.println(temperature
        + "F degrees and " + humidity + "% humidity");

    }

    /*    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();

    }*/

    @Override
    public void update(Observable observable, Object o) {
        if(observable instanceof WeatherData){
            WeatherData weatherData = (WeatherData) observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
