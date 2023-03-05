package ClassStuff;

public class DoCount {
    public static void main(String[] args) {
        int number = 95;

    //    countUp(number);
        countUp(90);
    }

    public static void countUp(int number) {
        do {
            System.out.println(number);
            number++;
        }
        while (number <= 100);
    }
}
