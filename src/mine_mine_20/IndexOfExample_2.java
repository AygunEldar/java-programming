package mine_mine_20;

public class IndexOfExample_2 {
    public static void main (String[] args){

        String tech ="java, html, testng, selenium, cucumber, maven";

        System.out.println(tech.replace(",","-"));
        System.out.println(tech.indexOf(","));
        System.out.println(tech.indexOf("t"));
        System.out.println(tech.lastIndexOf("n"));

        int idxOfJava = tech.indexOf("java");
        System.out.println("Java = " + idxOfJava);

        int idxOfMaven = tech.indexOf("maven");
        System.out.println("Maven = " + idxOfMaven);

        int idxOfHtml = tech.indexOf("html");
        System.out.println("html = " + idxOfHtml);

 if(tech.indexOf("html") >1){
     System.out.println("Html is present");
 }else{
     System.out.println("html isn't present ");
 }

    }
}
