package Exercises;

public class Discount {
    public static void main(String[] args) {
        /* full bus ticket = 3,2€
        Edna (senior) = -15%
        Lola (dog) = -20%
        Paul (student) = -10%
        2 trips each = 6 * 3.2
         */

        double busTicket = 3.2;
        boolean isSenior;
        boolean isDog;
        boolean isStudent;

        double totalBusTicketNoDiscount = 6 * busTicket;

        double busTicketEdna = getBusDiscount(busTicket, true, false, false);
        double busTicketPaul = getBusDiscount(busTicket, false, false, true);
        double busTicketLola = getBusDiscount(busTicket, false, true, false);

        double totalBusTicketCostWithDiscount = 2 * (busTicketEdna + busTicketLola + busTicketPaul);

        double totalBusSavings = totalBusTicketNoDiscount - totalBusTicketCostWithDiscount;

        System.out.println("They saved " + totalBusSavings + " Euros on the bus.");

        //bookshop discount = -10% IF >=2 fiction && >= 1 non-fiction

        int fiction = 2;
        int nonFiction = 2;

        int totalBookCostNoDiscount = 23 + 28 + 15 + 18;
        double totalSpentOnBooks = getBookDiscount(totalBookCostNoDiscount, 2, 2);
        double totalBookSavings = totalBookCostNoDiscount - totalSpentOnBooks;


        System.out.println("they saved " + totalBookSavings + " Euros on books.");

        double totalSavings = totalBookSavings + totalBusSavings;

        System.out.println("In total they saved " + totalSavings + " Euros.");

        double fullPriceForEverything = 6 * 3.2 + totalBookCostNoDiscount;
        double amountSpent = busTicketEdna + busTicketLola + busTicketPaul + totalSpentOnBooks;

        double totalSpent = fullPriceForEverything - amountSpent;

        System.out.println(fullPriceForEverything);
        System.out.println(amountSpent);
        System.out.println(totalSpent);










        }



    public static double getBusDiscount(double busTicket, boolean isSenior, boolean isDog, boolean isStudent) {
        double discountedPrice;
        if (isSenior) {
            discountedPrice = busTicket * 0.85;
        } else if (isDog) {
            discountedPrice = busTicket * 0.80;
        } else if (isStudent) {
            discountedPrice = busTicket * 0.90;
        } else {
            discountedPrice = busTicket;
        }
        return discountedPrice;
    }

    public static double getBookDiscount(int totalBookCostNoDiscount, int fiction, int nonFiction) {
        double bookDiscount;
        if ( fiction >= 2 && nonFiction >=1) {
            bookDiscount = totalBookCostNoDiscount * 0.9;
        } else {
            bookDiscount = totalBookCostNoDiscount;
        } return bookDiscount;
    }
}

