package officehours05_12;

public class Bank {
    public static void main(String[] args) {

        BankAccount bankAccountOne = new BankAccount() ;
        bankAccountOne.pin =1234;
        bankAccountOne.accountHolderName = "James Bond";
        bankAccountOne.accountNumber = 2133213113131L;
        bankAccountOne.balance = 1_000_000;

        System.out.println(bankAccountOne.pin);
        System.out.println(bankAccountOne.getBalance(1234));
        System.out.println();


        System.out.println(new BankAccount().accountHolderName);

        bankAccountOne = new BankAccount();
        System.out.println(bankAccountOne.accountHolderName);
    }
}
