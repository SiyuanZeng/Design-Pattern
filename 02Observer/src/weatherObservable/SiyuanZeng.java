package weatherObservable;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by SiyuanZeng's on 6/14/2014.
 */
public class SiyuanZeng implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
//    private WeatherData weatherData;

    Observable observable;


    public SiyuanZeng(Observable observable) {
//        this.weatherData = weatherData;
//        weatherData.registerObserver(this);
        this.observable = observable;
        observable.addObserver(this);
    }

/*
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
*/

    public void display() {
        System.out.println("Siyuan");
        System.out.println("Temperature" + temperature + ", Humidity" + humidity + ", Pressure" + pressure);
    }

    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof  WeatherData){
            WeatherData weatherData = (WeatherData)observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }

    }
}
