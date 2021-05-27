package mine_mine;

public class drinkNestedIf {
    public static void main(String[] args) {

        int type = 1;
        int drink = 2;
        double price = 0.0;
        String drinkType = "none";
        if (type == 1) {
            System.out.println("Hot drink: 1-Tea 2-Coffee");
            if (drink == 1) {
                price = 2.0;
                drinkType = "tea";

            } else if (drink == 2) {
                price = 4.0;
                drinkType = "coffee";
            } else {
                System.out.println("Invalid hot drink selection");
            }
        } else if (type == 2) {
            System.out.println("Cold drink: 1-Iced tea  2-Lemonade");
            if (drink == 1) {
                price = 5.0;
                drinkType = "Iced tea";

            } else if (type == 2) {
                price = 3.0;
                drinkType = "lemonade";
            } else {
                System.out.println("Invalid cold drink selection");
            }
        }else{
            System.out.println("Invalid drink type selection!");
        }
        if (drinkType.equals("none")){
            System.out.println("please try again");

        }System.out.println("Your total for "+drinkType + " is $"+ price);
    }
}