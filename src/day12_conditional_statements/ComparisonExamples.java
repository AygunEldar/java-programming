package day12_conditional_statements;

public class ComparisonExamples {
    public static void main (String [] args ){

        int currentSpeed = 45;
        int speedLimit = 55;
        boolean isSpeeding = currentSpeed > speedLimit;

        System.out.println("Are you speeding?-" + isSpeeding);
        System.out.println("Current speed = " + currentSpeed+" mph");
        System.out.println("Speed limit = " + speedLimit +" mph");

        currentSpeed +=20;
        isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding?-" + isSpeeding);
        System.out.println("Current speed = " + currentSpeed+" mph");
        System.out.println("Speed limit = " + speedLimit +" mph");

        double accountBalance = 250.25;
        double itemPrice = 200.99;
        System.out.println("Can I afford "+(accountBalance >= itemPrice));//true

        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("Can afford =" +canAfford);

        accountBalance -=itemPrice;
        accountBalance = accountBalance - itemPrice;
        // boolean isBroke = accountBalance < itemPrice;
        boolean isBroke = accountBalance <= 0;
        System.out.println("Am I broke = " + isBroke);





    }
}
