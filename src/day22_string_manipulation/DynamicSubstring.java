package day22_string_manipulation;

public class DynamicSubstring {
    public static void main(String[] args) {


        String  result = "result count:12345";
        System.out.println(result.substring(13,18));// same
        System.out.println(result.substring(13));

        System.out.println(result.indexOf(":"));
        int colonIndex = result.indexOf(":");
        System.out.println(result.substring(colonIndex+1));
        // now we can combine them in one line
        System.out.println("****************");
        System.out.println(result.substring(result.indexOf(":")+1));

        String today ="I learned [java] today";
        int start = today.indexOf("[");
        int end = today.indexOf("]");
        System.out.println(today.substring(start+1, end));
       // System.out.println(today.substring(today.indexOf("[")));
       // System.out.println(today.substring(today.indexOf("]")));

        System.out.println(today.substring(today.indexOf("[")+1,today.indexOf("]")));


    }
}
