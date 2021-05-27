package officehours05_18;

import java.util.Locale;

public class Mutability {
    public static void main(String[] args) {

        String one = "java";
        String two = one;
        String three =two.toUpperCase();
        System.out.println(three);


        System.out.println(two.toUpperCase().equals(three) );//true
        System.out.println(two.toUpperCase() == three );//false

        one =one.substring(2);
        System.out.println(one);//va
        System.out.println(two);//java
        System.out.println(three);//JAVA

        String a = new String("anything");
         String b= a;
        System.out.println(b);
        System.out.println(a);
        System.out.println("******************");

        b= b.toUpperCase();
        System.out.println("b = " + b);
        System.out.println("a = " + a);
    }
}
