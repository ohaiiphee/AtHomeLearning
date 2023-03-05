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
}

