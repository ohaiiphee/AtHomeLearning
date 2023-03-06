package classes;

import java.util.Scanner;

public class Class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter something: ");
        int number = scanner.nextInt();

        Katze mieze = new Katze(true, true, "Grey", 4);
        Katze schnurrbert = new Katze(true, true, "Red Brown", 3);
        Katze cookie = new Katze(false, true, "n/a", 4);

        String miezeSpeaks = mieze.speak();
        System.out.println(miezeSpeaks);

        System.out.println(schnurrbert.speak());
    }


}
