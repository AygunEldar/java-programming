package day19_class_vs_oblect_strings;

public class StartsWithEndsWith {
    public static void main(String[] args) {

        String word = "Azerbaijan";
        System.out.println(word.endsWith("an"));
        System.out.println(word.endsWith("jan"));
        System.out.println(word.endsWith("baijan"));

        System.out.println(word.startsWith("Aze"));
        System.out.println(word.startsWith("Azer"));
        System.out.println(word.startsWith("Azerb"));

        System.out.println("book".startsWith("b"));
        System.out.println("book".startsWith("Bo"));

        String name = " Irina";
        if (name.endsWith("a")){
            System.out.println("maybe, it is a female name");
        }


       String firstName = "Mrs. Alizada";

        if(firstName.startsWith("Dr.")){
            System.out.println("Doctor");
        }else if(firstName.startsWith("Mr.")){
            System.out.println("Man");
        }else if(firstName.startsWith("Mrs.")){
            System.out.println("Married woman");
        }else if(firstName.startsWith("Ms.")){
            System.out.println("Single woman");
        }else if(firstName.startsWith("Sr.")){
            System.out.println("Senior");
        }else{
            System.out.println("child");

        }

// String url = "https://stackoverflow.com";
        //.com- (commercial website)
        //.ru - russian website
        //.gov- government website
        //.edu - education

        String url = "www.giantpanda.com";
        if (url.endsWith(".com")){
            System.out.println("commercial website");
        }else if (url.endsWith(".edu")){
            System.out.println("Educational website");
        }else if(url.endsWith(".ru")){
            System.out.println("Russian website");
        }else if(url.endsWith(".gov")){
            System.out.println("Governmental website");
        }else{
            System.out.println("unidentified website");
        }



    }
}
