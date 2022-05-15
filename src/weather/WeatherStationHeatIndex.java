package weather;

public class WeatherStationHeatIndex {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        CurrentConditionDisplay currentConditionDisplay=new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay=new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay=new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay=new HeatIndexDisplay(weatherData);
        weatherData.setMeasurment(80,65,30.4f);
        weatherData.setMeasurment(82,70,29.2f);
        weatherData.setMeasurment(78,90,29.2f);
    }
}
