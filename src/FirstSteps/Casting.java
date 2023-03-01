package FirstSteps;

public class Casting {
    public static void main(String[] args) {
        //There are 2 types of casting
        //Widening Casting (automatic) - converts a smaller type to a larger type
        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myInt);
        System.out.println(myDouble);

        //Narrowing Casting (manual) - converts a larger type to a smaller type
        double anotherDouble = 9.78;
        int anotherInt = (int) anotherDouble;
        System.out.println(anotherDouble);
        System.out.println(anotherInt);
    }
}
