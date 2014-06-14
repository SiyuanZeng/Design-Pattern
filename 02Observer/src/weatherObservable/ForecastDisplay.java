package weatherObservable;

/*
built-in
import javafx.beans.*;
*/

import weather.*;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by SiyuanZeng's on 6/14/2014.
 */
//public class ForecastDisplay implements Observable, DisplayElement {
public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
//    private Subject weatherData;
    private Observable observable;

//    public ForecastDisplay (WeatherData weatherData){
//        this.weatherData = weatherData;
//        weatherData.registerObserver(this);
//    }

    public ForecastDisplay (Observable observable ){
        this.observable = observable;
//        observable.registerObserver(this);
        observable.addObserver(this);
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

    /*    @Override
    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }*/

    public void update (Observable observable, Object arg){
        if (observable instanceof WeatherData){
            WeatherData weatherData = (WeatherData)observable;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

}
