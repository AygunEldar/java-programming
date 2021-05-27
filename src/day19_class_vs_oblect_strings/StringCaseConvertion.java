package day19_class_vs_oblect_strings;

public class StringCaseConvertion {
    public static void main(String [] args){
        String word ="CyberTek";
        String sentence = "Java Is Fun";
        System.out.println(word);
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println(sentence.toLowerCase());
        System.out.println(sentence.toUpperCase());

        System.out.println("*********************************************");

        word.toLowerCase();
        System.out.println(word);

        String wordInLcase = word.toLowerCase();
        System.out.println("wordInLcase  " + wordInLcase);
        word = word.toLowerCase();
        System.out.println(" word = " +word);

        System.out.println("***************************");
         String company = "Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("Company in upper case " +company.toUpperCase());
        System.out.println("java".toUpperCase());

        //change company "Amazon' to "AMAZON"

        System.out.println("company = " + company);
        company = company.toUpperCase();
        System.out.println("company = " +company);

    }
}
