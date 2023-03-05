package Exercises;

public class PingPong {
    public static void main(String[] args) {
        int counter = 1;


        while (counter <= 100) {
            if (counter % 6 == 0) {
                System.out.println( counter + " - ping pong");
            } else if (counter % 3 == 0) {
                System.out.println(counter + " - ping");
            } else if (counter % 2 == 0) {
                System.out.println(counter + " - pong");
            } else {
                System.out.println(counter + " -");
            }
            counter++;
        }

        System.out.println("--------------------------------------------------");

        for (int i = 1; i <= 100; i++) {
            if (i % 6 ==0) {
                System.out.println( i + " ping pong");
            } else if ( i % 3 == 0) {
                System.out.println(i + " ping");
            } else if (i % 2 == 0) {
                System.out.println(i +" pong");
            } else {
                System.out.println(i +" -");
            }
        }
    }
}
