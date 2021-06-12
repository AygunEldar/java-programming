package day49_static;

import officehours05_12.Bank;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount  son = new BankAccount();
        son.user = "Elgun";
        son.showBalance();
        son.spend(100.0);
        son.showBalance();
        BankAccount son2 = new BankAccount();
        son2.user = "Eldar";
        son2.showBalance();
        son2.spend(400);
        son2.showBalance();

        son.showBalance();
      //  System.out.println(BankAccount.balance);
    }
}
