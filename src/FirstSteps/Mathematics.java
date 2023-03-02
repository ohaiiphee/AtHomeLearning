package FirstSteps;

public class Mathematics {
    public static void main(String[] args) {

        System.out.println(Math.max(5,10));
        //gives the highest value
        System.out.println(Math.min(2,20));
        //gives the lowest value
        System.out.println(Math.sqrt(64));
        //returns the square root
        System.out.println(Math.abs(-4.7));
        //returns the absolute (positive) value of a number
        System.out.println(Math.random());
        //returns a random number between 0.0 - 1.0
        int randomNum = (int) (Math.random() * 101);
        System.out.println(randomNum);
        // returns number between 0 - 100


    }
}
