package ClassStuff;

public class LivingRoom {
    public static void main(String[] args) {

        double squareMeters = 75;
        double pricePerSquareMeter = 10.5;
        String address = "Leonhardstrasse 45";

        System.out.println("The house at " + address + " costs " + (squareMeters * pricePerSquareMeter) + " euros.");

    /* Data types in Java:
    Whole numbers:
    byte              -128 to 127               (1 byte)
    short             -32,768 to 32,767         (2 bytes)
    int               -2^31 to 2^31-1           (4 bytes)
    long   -9223372036854775808 to 9223372036854775807   (8 bytes)

    Fractional Numbers:
    float             1,4*10^-45 to 3,4*10^38    (4 bytes)
    double            5,0*10^-324 to 1,7*10^308  (8 bytes)

    LONG is used for self incrementing ID numbers in growing databases.
    FLOAT and DOUBLE are used for simple calculations, but DOUBLE can
    store more decimal digits so calculations are more precise.

    Not numbers:
    char              'a'                  (2 bytes)
    boolean           true/false           (1 bit)

    Primitive data types:
    - byte        -int        -float    -double
    -short        -long       -char     -boolean

     */

    }
}
