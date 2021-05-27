package saim_only_03_22;
import java.util.Scanner;

public class UserNamePassWord {
    public static void main (String [] args){
    Scanner scan= new Scanner (System.in);
        System.out.println("Enter username: ");
        String userName = scan.next();
        System.out.println("Enter password: ");
         String passWord = scan.next();
        if(passWord.length() < 5){
            System.out.println("Password can't be less than 5 character");
        }else{
            System.out.println("Valid password");
        }

          if(passWord.contains(userName)){
              System.out.println("Invalid password, user name should not be in it");
          }

              System.out.println(passWord.length());
        System.out.println(passWord.replace(passWord,"password"));



    }
}
