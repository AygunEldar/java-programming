package mine_mine_loop;
import java.util.*;

public class ReplLoop {
    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        do{
            System.out.println("Enter Item1 and its price:");
            if(item.equals(countinue)){
              //  countinue++;
                System.out.println("Add one more item?");




            }else{
                System.out.println("shopping list report and total price: "+totalPrice);
            }

        }while(count <= 10);


    }

}
