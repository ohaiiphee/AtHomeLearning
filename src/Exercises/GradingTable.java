package Exercises;

public class GradingTable {
    public static void main(String[] args) {
        int points;

        getGrade(49);
        getGrade(52);
        getGrade(69);
        getGrade(80);
        getGrade(99);
        getGrade(120);
        getGrade(3);
    }

    public static String getGrade(int points) {
        String fail = "Fail";
        if (points >= 90) {
            System.out.println("Outstanding");
        } else if (points >=78) {
            System.out.println("Excellent");
        } else if (points >=65) {
            System.out.println("Acceptable");
        } else if (points >=51) {
            System.out.println("Passing");
        } else if (points <=50) {
            System.out.println("Fail");
        } return fail;
    }
}
