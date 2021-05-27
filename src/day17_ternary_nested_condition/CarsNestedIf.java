package day17_ternary_nested_condition;
import java.util.Scanner;
public class CarsNestedIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the car model:");

        char model = scan.next().charAt(0);
        System.out.println("Plese enter trim: ");
        scan.nextLine();
        String trim = scan.nextLine();
        String price = "";
        int range = 0;
        double mph = 0;
        String report = "";

        if (model == 'S' || model == 's') {
            if(trim.equals("Long range") || trim.equals("long range")){
               price = " $ 65.850";
               range = 412;
               mph  = 3.1;
               report = "Car model is: " +model +"\nPrice is: "+price +"\nMPH is: "+mph +
                       " sec \nRange is: "+ range +" mile";
            }else if(trim.equals("Plaid") || trim.equals("plaid")){
                price = " $ 108.800";
                range= 390;
                mph =1.99;
                report = "Car model is: " +model +"\nPrice is: "+price +"\nMPH is: "+mph +
                        " sec \nRange is: "+ range +" mile";
            }else if(trim.equals("Plaid plus") || trim.equals("plaid plus")) {
                price = " $ 138.700";
                range = 520;
                mph = 1.99;
                report = "Car model is: " + model + "\nPrice is: " + price + "\nMPH is: " + mph +
                        " sec \nRange is: " + range + " mile";
            }
            }else if (model == '3'){
                if(trim.equals("Standard Range Plus") || trim.equals("standard range plus")) {                    price = "$ 45.700";
                    range = 263;
                    mph = 5.3;
                    report = "Car model is: " + model + "\nPrice is: " + price + "\nMPH is: " + mph +
                            " sec \nRange is: " + range + " mile";

                }else if(trim.equals("Long Range") || trim.equals("long range")){
                    price =" $ 31.700 ";
                    range = 353;
                    mph = 4.2;
                    report = "Car model is: " +model +"\nPrice is: "+price +"\nMPH is: "+mph +
                            " sec \nRange is: "+ range +" mile";
                }else if(trim.equals("Plaid plus") || trim.equals("plaid plus")){
                    price = "$ 47.700";
                    range = 315;
                    mph = 3.1;
                    report = "Car model is: " +model +"\nPrice is: "+price +"\nMPH is: "+mph +
                            " sec \nRange is: "+ range +" mile";
                }


        }else if(model == 'X' || model == 'x'){
            if(trim.equals("LongRange")||trim.equals("long range")){
                price = "$ 90.600";
                range = 360;
                mph = 3.8;
                report = "Car model is: " +model +"\nPrice is: "+price +"\nMPH is: "+mph +
                        " sec \nRange is: "+ range +" mile";

            }else if(trim.equals("Plaid") || trim.equals("plaid")){
                price = " $ 124.600";
                range = 340;
                mph = 2.5;
                report = "Car model is: " +model +"\nPrice is: "+price +"\nMPH is: "+mph +
                        " sec \nRange is: "+ range +" mile";
            }
        }else{
            report = "Invalid entry of Model";
        }
          System.out.println(report);
    }
}