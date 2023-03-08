package Exercises;

public class Triangle {
    public static void main(String[] args) {
        int rows = 9;

        // outer loop
        for (int i = 0; i <= rows; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
}
