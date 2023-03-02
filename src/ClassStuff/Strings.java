package ClassStuff;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        /* Strings are already extensive objects;
           they are basically an array of chars.
           Because Strings are classes, they come with methods -
           If you put a dot immediately after an object, IntelliJ
           shows you the possible attributes and methods
           that come with the class.
         */

        String s = "Some text";
        s.toLowerCase();
        System.out.println(s);

        // Strings are not compared with == but with the equals method

        Scanner one = new Scanner(System.in);
        System.out.println("What is your age?");
        String age = one.nextLine();

        Scanner two = new Scanner(System.in);
        System.out.println("Choose a number from 1-10");
        String number = two.nextLine();

        System.out.println("Are these the same number? " + one.equals(two));
    }
}
