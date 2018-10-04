package MeterFeet;

public class MeterFeet {

    public static double meterTofeet(double meter){

        double feet = 0;
        feet = 3.279 * meter;
        return feet;

    }

    public static double feetToMeter(double feet){

        double meter = 0;
        meter = 0.305 * feet;
        return meter;

    }

    public static void main(String[] args) {

        double a = feetToMeter(10);
        System.out.println("10 feet is = " + a + " meters");

        double b = meterTofeet(10);
        System.out.println("10 meters is = " + b + " feet");
    }




}
