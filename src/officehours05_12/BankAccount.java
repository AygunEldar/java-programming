package officehours05_12;

public class BankAccount {

    //public static void main (String [] args ){

        String accountHolderName;//null by default
        public int pin;
        double balance;
        long accountNumber;


   // }
    public double getBalance(int inputPin){
        if(pin == inputPin){

            return balance;
        }
        return -1;
    }


}
