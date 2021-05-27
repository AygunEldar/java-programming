package April;
import java. util.*;

public class Repl_Split {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        //Write your code below
        String[] email2 = email.split("@");
        System.out.println(Arrays.toString(email2));
        for(String each : email2){
            if (!each.contains("@") && each.contains("@@")){
                System.out.println("Invalid email ");

            }else{

            }

        }
        System.out.println("Email id: "+email2[0] +"\nEmail domain: "+email2[1]);
    }
}
