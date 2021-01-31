package observerpattern;

public class SimpleWeatherDisplay implements Observer, Display {

    private float temp;
    private float humidity;
    private Subject weatherData;

    public SimpleWeatherDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Temp " + temp + "F \n" + "Current humidity "+ humidity + " \n");
    }
}
