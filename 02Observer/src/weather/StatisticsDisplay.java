package weather;

/**
 * Created by SiyuanZeng's on 6/14/2014.
 */
public class StatisticsDisplay implements Observable, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReading;
    private Subject weatherData;

    public StatisticsDisplay (WeatherData weatherData ){
        this.weatherData = weatherData ;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Statistics:");
        System.out.println("Avg/Max/Min temperature = " + (tempSum/numReading)
        + "/" + maxTemp + "/" + minTemp);

    }

    @Override
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

    }
}
