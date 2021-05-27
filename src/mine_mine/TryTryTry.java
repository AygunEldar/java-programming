package mine_mine;
import java.util.Scanner;
public class TryTryTry {

    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        Scanner scan = new Scanner (System.in);

        int balance = 100;
        String item = scan.nextLine();



            if(item.equals("Charger")){
            balance = balance -15;

        }else if(item.equals("USB cable")){
            balance = balance -10;


        }else if(item.equals("Headphones")){
            balance = balance -30;


        }else if(item.equals("Pants")){
            balance = balance -50;


        }else if(item.equals("Hat")){
            balance = balance -25;


        }else if(item.equals("Socks")){
            balance = balance -5;


        }else if(item.equals("Blanket")){
            balance = balance -60;


        }else if(item.equals("Pillow")) {
                balance = balance - 40;

            }else if(item.equals("Smartphone") ||item.equals("Laptop")) {
                    System.out.println("Sorry, not enough funds on your gift card!");
                }
                else{
            System.out.print("Invalid item!");
        }

        System.out.println("Thank you for your purchase!");
        System.out.print("Your current balance is: "+balance+"$");

    }



    }



