package Group25;
import java.util.*;

public class Replits_email1 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String email = scan.next();

         if (email.contains("_")) {
             String first = email.substring(0, email.indexOf("_"));
             String last = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
             System.out.println(last + "_"+first+"@gmail.com");
         }else{
             System.out.println(email);
         }





















    }
}
