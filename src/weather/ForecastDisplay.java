package weather;

import java.nio.file.Watchable;

public class ForecastDisplay implements Observer,DisplayElement{

    private float currentPressure =29.92f;
    private float lastPressure;
    private WeatherData weatherData;
    public ForecastDisplay(WeatherData weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("forecast  ");
        if(currentPressure>lastPressure){
            System.out.println("Improving weather on the way");
        }
        else if(currentPressure==lastPressure)
        {
            System.out.println("More of the same");
        }
        else if(currentPressure<lastPressure){
            System.out.println("Watch out for cooler ,rainy weather");
        }

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
    this.lastPressure=currentPressure;
    currentPressure=pressure;
    display();
    }
}
