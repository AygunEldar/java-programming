package saim_only_03_24;
import java.util.Scanner;

public class CreatingAnEmail {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter your name:");
        String name = scan.next();

        System.out.println("Enter your secret word:");
        String word = scan.next();

        String firstPart =name.substring(0,4).toLowerCase();
        String lastPart= word.substring(word.length()-3);
        System.out.println(firstPart + lastPart+"@cybertek.com");

        if(name.length() >=6 && word.length() >=6){

         }else{
             System.out.println("Invalid data");
         }




    }
}
