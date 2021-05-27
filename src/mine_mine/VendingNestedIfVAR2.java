package mine_mine;

public class VendingNestedIfVAR2 {
    public static void main(String[] args) {
        String  selection = "drink";
        String  drinkItem = "coke";
        String snackItem = "candy";

        if(selection.equals("drink")){
            System.out.println("Drink option is selected");
            if(drinkItem.equals("tea")){
                System.out.println("Tea selected");
            }else{
                System.out.println("Coke selected");
            }


        }else if (selection.equals("snack")){
            System.out.println("Snack option is selected");
            if(snackItem.equals("chips")){
                System.out.println("Chips is selected");
            }else{
                System.out.println("candy is selected");
            }
        }
    }
}
