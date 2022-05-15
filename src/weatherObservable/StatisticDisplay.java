package weatherObservable;

import java.util.Observable;
import java.util.Observer;

public class StatisticDisplay implements Observer,DisplayElement {
    private float maxTemp=0.0f;
    private float minTemp=2.00f;
    private float tempSum=0.0f;
    private int numReading;
    Observable observable;

    public StatisticDisplay(Observable observable){
        this.observable=observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)observable;
            float temp = weatherData.getTemperature();
            tempSum += temp;
            numReading++;

            if (temp > maxTemp) {
                maxTemp = temp;
            }

            if (temp < minTemp) {
                minTemp = temp;
            }

            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReading)
                + "/" + maxTemp + "/" + minTemp);
    }
}
