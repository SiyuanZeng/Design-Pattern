package weatherObservable;


import java.util.Observable;
import java.util.Observer;

/**
 * Created by SiyuanZeng's on 6/14/2014.
 */
/*public class StatisticsDisplay implements Observable, DisplayElement {*/
public class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReading;

    /*    private Subject weatherData;*/
    java.util.Observable observable;


    /*    public StatisticsDisplay (WeatherData weatherData ){
        this.weatherData = weatherData ;
        weatherData.registerObserver(this);
    }*/

    public StatisticsDisplay(java.util.Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }



    @Override
    public void display() {
        System.out.println("Statistics...");
        System.out.println("Avg/Max/Min temperature = " + (tempSum/numReading)
        + "/" + maxTemp + "/" + minTemp);

    }

/*    @Override
    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        numReading++;

        if (temp > maxTemp) {
            maxTemp = temp;
        }

        if (temp < minTemp){
            minTemp = temp;
        }

        display();

    }*/

    /*    @Override
        public void update(Observable observable, Object o) {

    }*/

    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof  WeatherData){
            WeatherData weatherData = (WeatherData)observable;
            float temperature = weatherData.getTemperature();
            tempSum += temperature;
            numReading++;

            if (weatherData.getTemperature()> maxTemp) {
                maxTemp = temperature;
            }

            if (temperature< minTemp){
                minTemp = temperature;
            }

            display();
        }

    }
}
