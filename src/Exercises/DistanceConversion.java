package Exercises;

public class DistanceConversion {
    public static void main(String[] args) {
        int kilometers = 2;

        double miles = kilometersToMiles(kilometers);

        double anotherMiles = anotherKilometerToMiles(kilometers);

        System.out.println(kilometers + "Km is " + miles + "miles.");

        System.out.println(kilometers+ "Km is " + anotherMiles + "miles.");

        kilometers = 5;

        System.out.println(kilometers + "Km is " + miles + "miles.");

        System.out.println(kilometers+ "Km is " + anotherMiles + "miles.");


        }



    public static double kilometersToMiles(int kilometers) {
        return kilometers * 0.62137;
    }

    public static double anotherKilometerToMiles(int kilometers) {
        return kilometers / 1.609344;
    }

}
