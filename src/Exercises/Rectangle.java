package Exercises;

public class Rectangle {
    public static void main(String[] args) {
        int width = 1;
        int length = 2;

        int circumference = calculateCircumference(width, length);
        int area = calculateArea(width, length);

        System.out.println(circumference);
        System.out.println(area);

    }

    public static int calculateCircumference (int width, int length) {
        return 2 * (width + length);
    }

    public static int calculateArea (int width, int length) {
        return width * length;
    }
}
