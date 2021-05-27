package day15_logicalOps_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {

        System.out.println("! TRUE = " + (!true));
        System.out.println("!FALSE = " + (!false));


        int age = 9;
        // check age is not than 5  "Need to sit in child car seat"

        if (!(age > 8)) {
            System.out.println("Need to sit in child car seat. age = " + age);
        } else {
            System.out.println("Can sit normal seat. age = " + age);
        }

        boolean isSmokingAllowed = false;

        if (!isSmokingAllowed) {
            System.out.println("Smoking is not allowed here. Exit.");
        }

        boolean isAffordable = false;

        if (!isAffordable) {

            System.out.println("Item is not affordable");
        } else {
            System.out.println("Affordable");
        }
        String carModel = "tesla";
        if (!carModel.equals("Tesla")) {
            System.out.println("Thank you I am not interested");
        }
        String secretPassword = "abc123";
        String inputPassword = "abc321";

        if (!inputPassword.equals(secretPassword)) {
            System.out.println("Incrrect password");

        }
        if (!inputPassword.equals("abc123")) {
            System.out.println("Incorrect password");
        }else{
            System.out.println("Incorrect password");
        }
    }
}