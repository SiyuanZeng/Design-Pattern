package weather;

/**
 * Created by SiyuanZeng's on 6/14/2014.
 */
public class CurrentConditionsDisplay implements Observable, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;


    @Override
    public void display() {

        System.out.println("Current conditions: ");
        System.out.println(temperature
        + "F degrees and " + humidity + "% humidity");

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();

    }


    //addToWeatherData
    public CurrentConditionsDisplay (Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
}
