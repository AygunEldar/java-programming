package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {

        String technologies ="java, html, css, selenium, testng, maven, cucumber";

        System.out.println(technologies.indexOf(","));//4 -first comma
        System.out.println(technologies.lastIndexOf(","));// 41-last comma

        int indexOfJava = technologies.indexOf("java" );
        System.out.println("java is at index " +indexOfJava);//4

        int indexOfcss = technologies.indexOf("css" );
        System.out.println("css is at index " +indexOfcss);//12

        int indexOfcucumber = technologies.indexOf("cucumber" );
        System.out.println("cucumber is at index " +indexOfcucumber);//42

        int indexOfsql = technologies.indexOf("sql" );
        System.out.println("sql is at index " +indexOfsql);//-1

        if(technologies.contains("maven")){
            System.out.println("maven is present");
        }else{
            System.out.println("maven is not present");
        }

        System.out.println("*******************************************");

        if(technologies.indexOf("maven") > -1){
            System.out.println(" maven is present");
        }else{
            System.out.println("maven is not present");
        }



    }
}
