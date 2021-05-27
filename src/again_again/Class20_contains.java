package again_again;

public class Class20_contains {
    public static void main(String[] args) {
        String word = ("Capital one");
        System.out.println(word.contains("one"));
        System.out.println(word.contains("l o"));
        System.out.println(word.contains("pi"));
        System.out.println(word.contains("ca"));

        if(word.contains(" ")){
            System.out.println("multiple");
        }else{
            System.out.println("single");
        }
        String etsyTitle = "wooden spoon | Etsy";
        if(etsyTitle.contains(" | ")){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

        String name ="ahmed";

        if(name.contains("a") && name.contains("e")){
            System.out.println("correct");
        }else{
            System.out.println("incorrect");
        }

        name ="nadir";
        if(name.contains("a") || name.contains("i")){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
       String email = "aygunelxan@gmail.com";
        if(email.contains("@") && email.endsWith(".com")){
            System.out.println("valid");
        }else{
            System.out.println("invalid");
        }
        if(email.toLowerCase().contains("x")){
            System.out.println("x is present");
        }else{
            System.out.println("x is not");
        }

    }
}
