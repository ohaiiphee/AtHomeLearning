package ClassStuff;

public class GradingTablesSwitch {
    public static void main(String[] args) {

        int grade;

        System.out.println(getGrade(1));
        System.out.println(getGrade(2));
        System.out.println(getGrade(3));
        System.out.println(getGrade(4));
        System.out.println(getGrade(5));
        System.out.println(getGrade(8));


    }

    public static String getGrade(int grade) {
        return switch (grade) {
            case 1 -> "Outstanding";
            case 2 -> "Excellent";
            case 3 -> "Acceptable";
            case 4 -> "Passing";
            default -> "Fail";
        };
    }

}
