package mine_mine_20;

public class ChainingStringMethods_2 {
    public static void main (String []args ){

        String word ="  wood en sp oon  ";

        System.out.println(word.trim().toUpperCase().toLowerCase().length());
        System.out.println(word.charAt(word.length()-1));

        System.out.println("****************************************");

        String city= "istanbul";
         String city1 = "England";

 System.out.println(city.toUpperCase());
 System.out.println(city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase());
 System.out.println(city1.substring(0,1).toUpperCase() + city1.substring(1).toLowerCase());

    }
}
