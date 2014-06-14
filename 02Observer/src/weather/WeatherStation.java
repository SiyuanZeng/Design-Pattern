package weather;

/**
 * Created by SiyuanZeng's on 6/14/2014.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80,65, 39.4f);
        weatherData.setMeasurements(83,64, 35.4f);
        weatherData.setMeasurements(88,68, 38.4f);
    }
}
