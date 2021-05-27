package Group25;

import java.util.Scanner;


public class March_12 {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println(" Please enter your password: ");
            int passWord = scan.nextInt();

            if(passWord == 8640){
                System.out.println(" Menu: 1-Withdraw 2-2Deposit " +
                        "3- Check Balance 4- Other");
            }else {
                System.out.println("Wrong password .Please try again!");

                //

            }

        }


    }

