package ClassStuff;

import java.util.Scanner;

public class Scanning {
    public static void main(String[] args) {
        // Scanner is used to get user input

        Scanner myObj = new Scanner(System.in); //Creates a scanner
        System.out.println("Enter username:");

        String userName = myObj.nextLine();  //Reads user input
        System.out.println("Username is " + userName);

        /* the method nextLine() is used to read Strings. Other types
        require other methods:
        nextBoolean()	    Reads a boolean value from the user
        nextByte()	        Reads a byte value from the user
        nextDouble()	    Reads a double value from the user
        nextFloat()	        Reads a float value from the user
        nextInt()	        Reads a int value from the user
        nextLine()	        Reads a String value from the user
        nextLong()	        Reads a long value from the user
        nextShort()         Reads a short value from the user
         */

        Scanner myOtherObj = new Scanner(System.in);
        System.out.println("Enter name, age and salary:");

        String name = myOtherObj.nextLine();
        int age = myOtherObj.nextInt();
        double salary = myOtherObj.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);



    }
}
