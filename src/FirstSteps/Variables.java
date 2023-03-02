package FirstSteps;

public class Variables {
    public static void main(String[] args) {
        String name = "Sofia";
        int age = 29;
        char letter = 'b';
        boolean answer = true;

        /* Primitive data types: byte, int, float, double
        boolean, char, short, long, ...

        double is more precise than float

        Non-Primitive data types: String, Arrays, Classes
         */


        int x = 5;
        int y = 2;

        System.out.println("My name is " + name + " and I'm " + age + " years old.");
        System.out.println(x * y);

        //char can display ASCII values
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;

        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);
    }
}
