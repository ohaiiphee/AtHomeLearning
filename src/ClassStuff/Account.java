package ClassStuff;

public class Account {
    public static void main(String[] args) {
        int years = 10;
        double investment = 2000;
        double investmentRate = 0.025;

        calculateAccountBalance(years, investment, investmentRate);


    }

    public static double calculateAccountBalance(int years, double investment, double investmentRate) {
        double accountBalance = investment;

        for (int i = 1; i <= years; i++) {
            accountBalance = accountBalance + (accountBalance * investmentRate);
            System.out.println(accountBalance + " Euros in year " + i);
        }
        return accountBalance;
    }

}
