package ClassStuff;

public class CountDown {
    public static void main(String[] args) {
        int number = 5;

        countDown(number);
        countDown(10);
        countDown(15);


    }

    public static void countDown(int number) {
        while (number >= 0) {
            System.out.println(number);
            number--;
        }
    }

}
