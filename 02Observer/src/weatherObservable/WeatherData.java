package weatherObservable;

import java.util.ArrayList;

/**
 * Created by SiyuanZeng's on 6/14/2014.
 */
public class WeatherData extends java.util.Observable {
    /*private ArrayList<Observable> observers;*/
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        /*observers = new ArrayList<Observable>()*/;
    }

    /*
    @Override
    public void registerObserver(Observable o) {
        observers.add(o);
    }*/

    /*    @Override
    public void removeObserver(Observable o) {
        int i = observers.indexOf(o);
        if (i >= 0){
            observers.remove(o);
        }
    }*/

    /*    @Override
    public void notifyObservers() {
        for (Observable observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }*/

    public void measurementsChanged () {
        /*notifyObservers();*/
        setChanged();// mark it to be true;
        notifyObservers();
    }

    public void setMeasurements (float temp, float humidity, float pressure){
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
