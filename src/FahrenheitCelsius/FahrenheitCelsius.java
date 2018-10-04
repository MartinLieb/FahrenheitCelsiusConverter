package FahrenheitCelsius;

public class FahrenheitCelsius {

    /** Convert from Celsius to Fahrenheit */
    public static double celsiusToFahrenheit(double celsius){

        double fahrenheit = 0;

        fahrenheit = (9.0 / 5) * celsius + 32;

        return fahrenheit;


    }

    // fahrenheit = (9.0 / 5) * celsius + 32


    /** Convert from Fahrenheit to Celsius */
    public static double fahrenheitToCelsius(double fahrenheit){

        double celsius = 0;

        celsius = (5.0 / 9) * (fahrenheit - 32);

        return celsius;


    }

    // celsius = (5.0 / 9) * (fahrenheit – 32)

    public static void main(String[] args) {

        double x = celsiusToFahrenheit(10);
        System.out.println(x);

        double y = fahrenheitToCelsius(50);
        System.out.println(y);

    }
    


}
