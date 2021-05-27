package April;
import java.util.*;

public class Method_Name {
    public static void main(String[] args) {
        System.out.println("His full name is " +fullName());
        System.out.println("He is married -" + isMarried());
        System.out.println("His age is " + age());
        System.out.println("The Random year is "+ getRandomYear());

    }


    public static String fullName(){
        return "Mike Smith";

    }
    public static boolean isMarried(){
        return false;
    }
    public static int age(){

        return 35;
    }


    public static int getRandomYear(){
        Random random =new Random();
        int randomYear = random.nextInt(2021);

        return randomYear;
    }
}
