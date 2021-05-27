package saim_only_03_20;

public class AccountNumber {
    public static void main(String[] args) {

         String accNum ="4246888999";
         if (accNum.startsWith("2") && accNum.length()==7){
             System.out.println("Valid 7 digit account number");
         }else{
             System.out.println("Invalid 7 digit account number");
         }
        if(accNum.startsWith("5") && accNum.length()==10){
            System.out.println("Valid 5 digit account number");
        }else if(!accNum.startsWith("2")||!accNum.startsWith("5"))  {
            System.out.println("Invalid accoun number");
        }




    }
}
