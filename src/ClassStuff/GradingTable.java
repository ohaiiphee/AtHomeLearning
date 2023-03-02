package ClassStuff;

public class GradingTable {
    public static void main(String[] args) {
        int points;

        getGrade(50);
        getGrade(80);
        getGrade(99);

    }

    public static String getGrade(int points) {
        String fail = "Fail";
 if (points >= 90) {
     System.out.println("Outstanding");
 } else if ( points > 76) {
     System.out.println("Excellent");
        } else if (points > 64) {
     System.out.println("Acceptable");
 } else if (points > 50) {
     System.out.println("Passing");
 }
 return fail;
    }
}
