package weather;

public class CurrentConditionDisplay implements Observer,DisplayElement{


    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Current Conditions: "+temperature+"F degree and "+humidity+"% humidity");

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
    this.temperature=temp;
    this.humidity=humidity;
    display();
    }
}
