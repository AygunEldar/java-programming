package day11_comparison_operators;

public class BooleanComparisonOperators {
    public static void main (String [] args){

        System.out.println(15==15);
        System.out.println(15 > 12);
        System.out.println( 15 < 18);
        System.out.println(15 >=14);
        System.out.println(15<=16);
        System.out.println(15 != 9);

        int a = 100;
        int b = 200;

        System.out.println(a==b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a != b);

        boolean result;
        result = 5 ==5;
        System.out.println("Result1 = " +result);

        result = 33 > 44;
        System.out.println("Result2 = " +result);

         result = 88 < 99;
        System.out.println("Result3 = " +result);

        result = 10>=10;
        System.out.println("Result4 = "+result);

        result = 123 <= 124;
        System.out.println("Result5 = "+result);

        result = 2 != 2;
        System.out.println("Result6 = "+result);

        String city = "Seattle";
        System.out.println(city=="Seattle");
        System.out.println(city=="Baku");
        System.out.println(city != "Fairfax");

        String name = "Nadir";
        boolean checkName = name == "Nadir";
        System.out.println("Name is " +checkName);

        checkName = name != "Kuzzat";
        System.out.println("Name is " + checkName);
    }
}
