package Exercises;

public class TemperatureConversion {
    public static void main(String[] args) {
 double temperatureInCelsius = 21.9;
 double temperatureInFahrenheit = celsiusToFahrenheit(temperatureInCelsius);

        System.out.println(temperatureInCelsius + " degrees Celsius are " + temperatureInFahrenheit + " degrees Fahrenheit.");

        temperatureInCelsius = 30;
        temperatureInFahrenheit = celsiusToFahrenheit(temperatureInCelsius);
        System.out.println(temperatureInCelsius + " degrees Celsius are " + temperatureInFahrenheit + " degrees Fahrenheit.");
    }

    public static double celsiusToFahrenheit(double temperatureInCelsius) {
        return (temperatureInCelsius * 1.8) + 32;
    }
}
