package weatherObservable;


import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer,DisplayElement {
    // things that needed to be observed and this thing is set by the constructor
    Observable observable;
    private float temperature;
    private float humidity;
    public CurrentConditionDisplay(Observable observable){
        this.observable=observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData){
            WeatherData weatherData=(WeatherData)obs;
            this.temperature=weatherData.getTemperature();
            this.humidity=weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+temperature+"F degree and "+humidity+" humidity");
    }
}
