package day46_encapsulation;

public class CapitalOne {

    public static void main(String[] args) {
        CheckingAccount  myBank =new CheckingAccount();

        myBank.setAccountNumber(45612398456554L);
        System.out.println("Account number is " + myBank.getAccountNumber());

        myBank.setAccountHolder("Mike Smith");
        System.out.println("Account holder is "+myBank.getAccountHolder());

        myBank.setBalance(256);
        System.out.println("Balance is " +myBank.getBalance());


        myBank.setType("360 checking");
        System.out.println("type is " +myBank.getType());

       // myBank.getBalance();

        System.out.println(myBank);


        System.out.println("#########################");


    }

}
