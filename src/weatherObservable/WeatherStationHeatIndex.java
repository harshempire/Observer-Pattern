package weatherObservable;

public class WeatherStationHeatIndex {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        CurrentConditionDisplay currentConditionDisplay=new CurrentConditionDisplay(weatherData);
        StatisticDisplay statisticDisplay=new StatisticDisplay(weatherData);
        ForecastDisplay forecastDisplay=new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay=new HeatIndexDisplay(weatherData);
        weatherData.setMeasurement(80,65,30.4f);
        weatherData.setMeasurement(82,70,29.2f);
        weatherData.setMeasurement(78,90,29.2f);
    }
}
