package weather;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        CurrentConditionDisplay currentConditionDisplay=new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay=new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay=new HeatIndexDisplay(weatherData);
        weatherData.setMeasurment(80,65,30.4f);
        weatherData.setMeasurment(82,70,29.2f);
        weatherData.setMeasurment(70,90,29.2f);
        weatherData.registerObserver(forecastDisplay);
        weatherData.setMeasurment(62,90,28.14f);
    }
}
