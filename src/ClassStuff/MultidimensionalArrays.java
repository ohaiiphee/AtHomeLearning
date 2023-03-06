package ClassStuff;

public class MultidimensionalArrays {
    public static void main(String[] args) {

        int[][] heartArray = {
                {0, 1, 0, 0, 0, 1, 0},
                {1, 1, 1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1},
                {0, 1, 1, 1, 1, 1, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 1, 0, 0, 0}
        };

        for (int[] row : heartArray) {
            for (int item : row) {
                if (item == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("x");
                }
            }
            System.out.println();
        }
    }
}
