package FirstSteps;

import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is " + txt.length());

        String txt2 = "Hello World";
        System.out.println(txt2.toUpperCase());
        System.out.println(txt2.toLowerCase());

        String txt3 = "Please locate where I am";
        System.out.println(txt3.indexOf("I"));

        // If you add a number and a string, the result will be a string concatenation

        String x = "10";
        int y = 20;
        String z = x + y;

        System.out.println(z);

        //Special characters can be written by adding a \

        String sentence = "We are the so-called \"Vikings\" from the north.";
        System.out.println(sentence);

    }
}
