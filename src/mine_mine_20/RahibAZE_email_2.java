package mine_mine_20;
import java.util.Scanner;

public class RahibAZE_email_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Creat an email");
        String email = scan.next();

        String start = email.substring(0,email.indexOf("_"));
        String end = email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@"),email.indexOf("."));

        System.out.println("First name: "+start.toUpperCase().substring(0,1)+start.toLowerCase().substring(1));

        System.out.println("Last name: "+end.toUpperCase().substring(0,1)+end.substring(1).toLowerCase());
        System.out.println("Domain: "+domain);




    }
}
