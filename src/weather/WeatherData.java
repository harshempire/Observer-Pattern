package weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

   private List<Observer> observerList;
   private float temperature;
   private float humidity;
   private float pressure;

   public WeatherData(){
       observerList=new ArrayList<Observer>();
   }
    @Override
    public void registerObserver(Observer o) {
    observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
    observerList.remove(o);
    }

    @Override
    public void notifyObserver() {
    for(Observer observer:observerList){
        observer.update(temperature,pressure,humidity);
    }
    }
    public void measurementChanged(){notifyObserver();}
    public void setMeasurment(float temperature,float humidity,float pressure){
       this.temperature=temperature;
       this.humidity=humidity;
       this.pressure=pressure;
       measurementChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}
