package ClassStuff;

public class IfElse {
    public static void main(String[] args) {
        // On the bus you receive a discount
        // if you are a senior citizen, a dog or a student.

        boolean senior = true;
        boolean dog = false;
        boolean student = false;

        checkBusDiscount(true, false, false);
        checkBusDiscount(true, true, false);


        // In a bookshop you receive a discount if you
        // buy more than 2 non-fiction books and at least one fiction book.

        int nonFiction = 2;
        int fiction = 2;

        String result = checkIfDiscount(nonFiction, fiction);

        System.out.println(checkIfDiscount(1, 1));
        System.out.println(checkIfDiscount(5, 5));
        System.out.println(checkIfDiscount(3, 0));


    }
    //Method to check for bus discount

    public static void checkBusDiscount (boolean senior, boolean dog, boolean student) {
        if (senior) {
            System.out.println("Discount");
        } else if (dog) {
            System.out.println("Discount");
        } else if (student) {
            System.out.println("Discount");
        } else {
            System.out.println("No discount");
        }
    }



        //Method to check for book discount
        public static String checkIfDiscount(int nonFiction, int fiction) {
            String discount = "Discount";
            String noDiscount = "No discount";

            if (nonFiction > 2 && fiction >= 1) {
                return discount;
            } else {
                return noDiscount;
            }
        }
}
