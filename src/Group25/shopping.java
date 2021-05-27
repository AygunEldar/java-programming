package Group25;
import   java.util.*;

public class shopping {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;


//        System.out.println("Enter Item1 and its price:");
//        item = scan.next();
//        price = scan.nextDouble();
//        shoppingListReport +="Item1: "+ item + "Price: "+price+ ", ";
//     totalPrice += price;

        for(count =2;count <=11; count++){
            System.out.println("Enter Item2 and its price:");
            item = scan.next();
            price = scan.nextDouble();
            shoppingListReport +="Item"+count+": " + item + " Price: "+price+ ", ";
            totalPrice += price;

            System.out.println("Add one more item?");
            countinue =scan.next();
            if(countinue.equalsIgnoreCase("yes")){


                System.out.println("Enter Item2 and its price:");
                item = scan.next();
                price = scan.nextDouble();
                shoppingListReport +="Item"+count+":" + item + "Price: "+price+ ", ";
                totalPrice += price;

            }
            else{
                System.out.println( shoppingListReport.substring(0,shoppingListReport.length()-2));
                System.out.println("Total price: "+totalPrice);
                break;
            }

        }
    }



}
