package again_again;

public class Class22_DynamicSubstring {
    public static void main(String[] args) {
        String result =("result count: 123456");
        System.out.println(result.substring(result.indexOf(":")+1));

        System.out.println("****************************************");

        int colonIndex = result.indexOf(":");
        System.out.println(result.substring(colonIndex+1));

        String today =" I learned [java] today";
       int first = today.indexOf("[")+1;
       int second =today.indexOf("]");
        System.out.println(today.substring(first, second));

    }


}
