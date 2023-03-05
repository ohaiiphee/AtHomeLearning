package ClassStuff;

public class Discount {
    public static void main(String[] args) {
        //discount bus
        //senior -15%
        //dog -20%
        //student -10%
        //full price 3,2€
        // senior + dog + grandson *2 bus

        //books
        //-10% > 2nonfiction + >= 1 fiction
        // 2 fiction: 15 + 18 €
        // 2 nonfiction: 23+28 €

        boolean isSenior = true;
        boolean isDog = true;
        boolean isStudent = true;

        double fullBusPrice = 3.2;

        double busTicketEdna = getBusDiscountPrice(fullBusPrice, true, false, false);
        double busTicketLola = getBusDiscountPrice(fullBusPrice, false, true, false);
        double busTicketPaul = getBusDiscountPrice(fullBusPrice, false, false, true);

        double totalBusPriceDiscounted = 2 * (busTicketEdna + busTicketLola + busTicketPaul);
        double totalBusPriceNoDiscount = 6 * fullBusPrice;

        double totalBusDiscount = totalBusPriceNoDiscount - totalBusPriceDiscounted;


    int fiction = 2;
    int nonFiction = 2;

    double fullBookPriceNoDiscount = 15 + 18 + 23 + 28;

    double totalBookPriceDiscounted = getBookDiscountPrice(fullBookPriceNoDiscount, fiction, nonFiction);

    double totalSavedMoney = (totalBusPriceNoDiscount + fullBookPriceNoDiscount) - (totalBusPriceDiscounted + totalBookPriceDiscounted);

    double fullBookDiscount = fullBookPriceNoDiscount - totalBookPriceDiscounted;

    System.out.println("Edna, Lola and Paul saved a total of " + totalSavedMoney);
    System.out.println(fullBookPriceNoDiscount);



}



    public static double getBusDiscountPrice(double fullBusPrice, boolean isSenior, boolean isDog, boolean isStudent) {
        double discountedPrice;
        if(isSenior) {
            discountedPrice = fullBusPrice * 0.85;
        } else if (isDog) {
            discountedPrice = fullBusPrice * 0.8;
        } else if (isStudent){
            discountedPrice = fullBusPrice * 0.9;
        } else {
            discountedPrice = fullBusPrice;
        }
        return discountedPrice;
    }

    public static double getBookDiscountPrice(double fullBookPrice, int fiction, int nonFiction) {
        double discountedBookPrice;
        if (fiction >= 1 && nonFiction > 2) {
            discountedBookPrice = fullBookPrice * 0.9;
        } else {
            discountedBookPrice = fullBookPrice;
        }
        return discountedBookPrice;
    }

}
