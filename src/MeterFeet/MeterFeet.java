package MeterFeet;

public class MeterFeet {

    public static double meterToFoot(double meter){

        double foot = 0;
        foot = 3.279 * meter;
        return foot;

    }

    public static double footToMeter(double foot){

        double meter = 0;
        meter = 0.305 * foot;
        return meter;

    }

    public static void main(String[] args) {

        double a = footToMeter(10);
        System.out.println(a);

        double b = meterToFoot(10);
        System.out.println(b);
    }




}
