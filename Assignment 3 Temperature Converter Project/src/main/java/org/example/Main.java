package org.example;

public class Main
{
    public static double celsiusToFahrenheit(double celsius)
    {
        return celsius * 1.8 + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit)
    {
        return (fahrenheit - 32)/1.8;
    }

    public static double celsiusToKelvin(double celsius)
    {
        return celsius + 273.15;
    }
}