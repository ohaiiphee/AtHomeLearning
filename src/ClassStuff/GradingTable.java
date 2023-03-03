package ClassStuff;



public class GradingTable {
    public static void main(String[] args) {
        int points =67;

getGrade(49);
getGrade(55);
getGrade(78);
getGrade(99);
getGrade(2);
getGrade(points);


    }

    public static String getGrade(int points) {
        String fail = "Fail";
        if (points >= 90) {
            System.out.println("Outstanding");
        } else if (points >= 78) {
            System.out.println("Excellent");
        } else if (points >= 65) {
            System.out.println("Acceptable");
        } else if (points >= 51) {
            System.out.println("Passing");
        } else if (points <= 50){
            System.out.println(fail);
        } return fail;
    }

}
