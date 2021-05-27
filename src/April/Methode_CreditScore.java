package April;

public class Methode_CreditScore {
    public static void main(String[] args) {
        checkEligible(876);
        checkEligible(876);
        checkEligible(876);
        System.out.println("Your credit score = " +getCreditScore());
        int score =getCreditScore();
        System.out.println("your score is " + score);
    }
    public static int getCreditScore(){
        return 800;
    }
    public static void checkEligible(int creditScore){

        if(creditScore >700){
            System.out.println("You are eligible for loan");
        }else{
            System.out.println("Sorry, you are not eligible");
        }
    }


}
