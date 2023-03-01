package FirstSteps;

public class Operators {
    public static void main(String[] args) {
        int sum = 100 + 50;

        int sub = 100 - 50;

        int mult = 100 * 50;

        int division = 100 / 50;

        int modulus = 100 % 50;

        int increment = 100;

        ++increment;

        int decrement = 100;

        --decrement;

        sum += 5;
        sub -= 5;

        System.out.println(increment);
        System.out.println(decrement);

        System.out.println(sum);
        System.out.println(sub);

        System.out.println(sum < sub);
        System.out.println(mult != division);
    }
}
