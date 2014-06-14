package weather;

/**
 * Created by SiyuanZeng's on 6/14/2014.
 */
public class SiyuanZeng implements Observable {
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public SiyuanZeng(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    private void display() {
        System.out.println("Siyuan");
        System.out.println("Temperature" + temperature + ", Humidity" + humidity + ", Pressure" + pressure);
    }
}
