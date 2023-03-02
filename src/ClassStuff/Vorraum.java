package ClassStuff;

public class Vorraum {
    public static void main(String[] args) {
        int doors = 3;
        double size = 7.5;
        String direction = "West";


        /* Primitive types can be converted into other types.
        byte -> short -> int -> long -> float -> double  */

        int a = 8;
        double d;
        d = a;
        a = (int) d;
        System.out.println(d);
        System.out.println(a);

        String s = "10";
        int b;
        b = Integer.valueOf(s);
        System.out.println(b);

    }
}
