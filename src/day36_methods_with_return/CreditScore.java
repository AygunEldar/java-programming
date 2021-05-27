package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {

        checkEligible(815);
        checkEligible(760);
        checkEligible(666);

       // System.out.println(checkEligible(711)); ERROR- CAN NOT PRINT METHOD it is VOID
        System.out.println(getCreditScore());
        System.out.println("CreditScore = " +getCreditScore());
        int score= getCreditScore();
        System.out.println("score = " + score);
    }
    public static int  getCreditScore(){
        return 800;
    }
    public static void checkEligible(int creditScore) {
        //int creditScore = 850;
        if (creditScore >= 700) {
            System.out.println("you are eligible for leasing this car");
        } else {
            System.out.println("Sorry, you are not eligible for leasing this car");
        }
        // ( System.out.println("credit score " + creditScore);)
    }
}