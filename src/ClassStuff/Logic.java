package ClassStuff;

public class Logic {
    public static void main(String[] args) {
        boolean sunshine = false;
        boolean rain = true;

        System.out.println(sunshine && rain);

        boolean confusion = true;
        boolean knowledge = false;

        System.out.println(confusion || knowledge);

        boolean result = 1 > 3 && !(3 - 1 < 5) || 2 * 2 == 4;

        System.out.println(result);

        System.out.println((6 >= 2*3 || 2-3 < 0) && (1*1 == 1 && 1 != 1+1));



    }
}
