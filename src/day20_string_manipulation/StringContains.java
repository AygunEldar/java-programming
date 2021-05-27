package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {

        String company = " Capital one";
        System.out.println(company.contains("i"));
        System.out.println(company.contains("ital"));
        System.out.println(company.contains("l o"));

        if (company.contains(" ")) {
            System.out.println("multiple words company name");
        } else {
            System.out.println("single word");
        }
        System.out.println("************************************************");
        String etsyTitle = "Wooden spoon | Etsy";

        if (etsyTitle.contains(" | ")) {
            System.out.println("title passed");
        } else {
            System.out.println("Failed");
        }
        System.out.println("*************************************************");
        String firstName = "ahmed";
        if (firstName.contains("a") && firstName.contains("e")) {
            System.out.println("The name has a and e");
        } else {
            System.out.println("not");
        }
        System.out.println("**********************************************");

        String first = "Nadir";
        if (firstName.contains("a") || firstName.contains("i")) {
            System.out.println("a or i is present");
        }else{
            System.out.println("neither a nor i ");
        }
        System.out.println("*************************************************");
 String email = "murodil@cybertekschool.com";
        if(email.contains("@") && email.endsWith(".com")){
            System.out.println("It is valid email");
        }else{
            System.out.println("invalid");
        }
        if (email.toLowerCase().contains("d")){
            System.out.println("d is present");
        }else{
            System.out.println("d is not exist");
        }
    }
}
