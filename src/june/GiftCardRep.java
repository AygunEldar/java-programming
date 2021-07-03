package june;

import java.util.Scanner;

public class GiftCardRep {
    public static void main(String[] args) {
        //Let's say I've got a 100$ gift card and you want to buy something in your online store .
        // Write a program that will help me to buy something and display leftover balance after purchase.
        // - If item is not in the list, display message: "Invalid item!".
        // - If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
        //
        //List of items
        //Blanket - 60$
        //Charger - 25$
        //Hat - 25$
        //Headphones - 30$
        //Laptop - 200$
        //Pants - 50$
        //Pillow - 40$
        //Smartphone - 1000$
        //Socks - 5$
        //USB cable - 10$
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the item name");
        String items = input.next();

        int blanketPrice =60;
        int chargerPrice =25;
        int hatPrice =25;
        int headphonePrice =30;
        int laptopPrice = 200;
        int pantsPrice = 50;
        int pillowPrice = 40;
        int smartPhonePrice = 1000;
        int sockPrice = 5;
        int usbCablePrice =10;
        int price =0;
        int balance = 100;

        if(items.equalsIgnoreCase("blanket")){
            balance -= blanketPrice;
            System.out.println("Thank you for your purchase");
            System.out.println("Your current balance is "+ balance+"$");
        }
        else if(items.equalsIgnoreCase("charger")){
            balance -= chargerPrice;
            System.out.println("Thank you for your purchase");
            System.out.println("Your current balance is "+ balance+"$");
        }
        else if(items.equalsIgnoreCase("hat")){
            balance -= hatPrice;
            System.out.println("Thank you for your purchase");
            System.out.println("Your current balance is "+ balance+"$");
        }
       else if(items.equalsIgnoreCase("headphone")){
            balance -= headphonePrice;
            System.out.println("Thank you for your purchase");
            System.out.println("Your current balance is "+ balance+"$");
        }
       else  if(items.equalsIgnoreCase("pants")){
            balance -= pantsPrice;
            System.out.println("Thank you for your purchase");
            System.out.println("Your current balance is "+ balance+"$");
        }
       else  if(items.equalsIgnoreCase("pillow")){
            balance -= pillowPrice;
            System.out.println("Thank you for your purchase");
            System.out.println("Your current balance is "+ balance+"$");
        }
       else if(items.equalsIgnoreCase("sock")){
            balance -= sockPrice;
            System.out.println("Thank you for your purchase");
            System.out.println("Your current balance is "+ balance+"$");
        }
       else if(items.equalsIgnoreCase("usbCable")){
            balance -= usbCablePrice;
            System.out.println("Thank you for your purchase");
            System.out.println("Your current balance is "+ balance+"$");


        }else if(items.equalsIgnoreCase("laptop") || items.equalsIgnoreCase("smartphone") && price > balance){
            System.out.println("Sorry, not enough funds on your gift card!");

        }else if(!items.equalsIgnoreCase("blanket")||!items.equalsIgnoreCase("charger")||!items.equalsIgnoreCase("hat")||!items.equalsIgnoreCase("headphone")||
                !items.equalsIgnoreCase("pants")||!items.equalsIgnoreCase("pillow")||!items.equalsIgnoreCase("sock")||!items.equalsIgnoreCase("usbCable")){
            System.out.println("Invalid item");


        }

    }
    }


