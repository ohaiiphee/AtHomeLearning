package Exercises;

import java.util.Scanner;

public class SumsAndVowels1 {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter a number: ");

        double sum = 0;
        double number = scanner1.nextDouble();

        while (number > 0) {
            if (number == 2) {
                sum *= 2;
            } else if (number == 3) {
                sum *= 3;
            } else if (number == 22) {
                sum /= 2;
            } else {
                sum += number;
            }

            System.out.println("Enter a number: ");
            number = scanner1.nextInt();
        }

        System.out.println("The sum of all numbers entered is " + sum);

        System.out.println(".........................................................................................");


        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter a letter: ");

        String letter = scanner2.nextLine();

        while (!letter.equals("0")) {
            if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") | letter.equals("u")) {
                System.out.println("Yes " + letter + " is a vowel :)");
            } else {
                System.out.println("No " + letter + " is not a vowel :(");
            }
            System.out.println("Enter another letter or press 0: ");
            letter = scanner2.nextLine();
        }


    }


 }

