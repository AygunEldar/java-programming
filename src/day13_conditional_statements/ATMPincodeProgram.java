package day13_conditional_statements;

public class ATMPincodeProgram {
    public static void main(String[] args) {

        System.out.println("***** WELCOME TO TD BANK ATM *****");

        int secretPincode = 2134;
        int inputPincode = 6544;

        if ( secretPincode == inputPincode){
            System.out.println(" Welcome to your account");
            System.out.println(" You can withdraw, check balance, deposit");

        }else{
            System.out.println(" Incorrect pincode! 1234");
            System.out.println(" Please try again! ");
        }
        System.out.println("THANK YOU FOR USING TD BANK ATM !");
    }
}
