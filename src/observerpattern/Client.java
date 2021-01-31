package observerpattern;

public class Client {
    public static void main(String[] args) {
        Subject weatherData = new WeatherData();
        SimpleWeatherDisplay simpleWeatherDisplay = new SimpleWeatherDisplay(weatherData);
        simpleWeatherDisplay.update(89, 78, 34);
    }
}
