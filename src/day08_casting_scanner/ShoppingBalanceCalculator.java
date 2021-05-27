package day08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main (String [] args ){

        double balance = 345.55;

        double price1 = 20.88;
        double price2 =89.99;
        int price3 = 15;

      //  double remainBal = balance - price1 - price2 - price3;
       // double remainBal = balance - (price1 + price2 + price3);
        double remainBal =  balance - (price1 + price2 + price3);

        System.out.println(remainBal);
        System.out.println("Your initial balance :  $ " +balance);
        System.out.println("Your remaining balance : $ " + remainBal);

        int balanceWithNoCent = (int) remainBal;
        System.out.println("Your remaining balance without cents : $ " +balanceWithNoCent);


    }
}
