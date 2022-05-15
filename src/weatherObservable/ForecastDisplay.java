package weatherObservable;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer,DisplayElement {

    // thing that is needed to be observed and initialized at object creation time
    Observable observable;
    private float currentPressure=29.92f;
    private float lastPressure;
    public ForecastDisplay(Observable observable){
        this.observable=observable;
        observable.addObserver(this);
    }
    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData){
            WeatherData weatherData=(WeatherData) obs;
            this.lastPressure=currentPressure;
            currentPressure=weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Forecast :");
        if(currentPressure>lastPressure){
            System.out.println("Improving weather on the way");
        }
        else if(currentPressure==lastPressure){
            System.out.println("More of the same");
        }
        else if(currentPressure<lastPressure){
            System.out.println("Watch out for cooler , rainy weather");
        }

    }
}
