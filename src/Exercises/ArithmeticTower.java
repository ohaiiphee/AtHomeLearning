package Exercises;

public class ArithmeticTower {
    public static void main(String[] args) {
        int number = 1;
        int numero = 9000000;

        System.out.println(number);
        multiply(number);


        divide(numero);
        System.out.println(divide(numero));

    }

    public static int multiply (int number) {
        int result = number;
        for (int i = 2; i <= 9; i++) {

            System.out.println(result + "*" + i);
            result = result * i;
        }
        return result;
    }

    public static int divide (int numero) {
        int division = numero;
        for (int i = 9; i >=2 ; i--) {
            System.out.println(division + "/" + i);
            division = division / i;
        }
        return division;
    }
}
