package com.example;

public class Main {

    // Converts Celsius to Fahrenheit: F = (C × 9/5) + 32
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    // Converts Fahrenheit to Celsius: C = (F − 32) × 5/9
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }

    // Converts Celsius to Kelvin: K = C + 273.15
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
}
