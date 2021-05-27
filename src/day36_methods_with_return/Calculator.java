package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
       // add();
        System.out.println(add(5.2, 3.2));
        double result =add(1,3);
        System.out.println("result = " +result);
        System.out.println("100.0 + 200.0 = "+ add(100,200));
        System.out.println(minus(8.9,4.4));
        System.out.println(minus(10,3));
        System.out.println(multiply(5.6,4.8));
        System.out.println(multiply(5.6,4.8));
        System.out.println(divide(6.4,2.2));
    }

    public static double add (double num1, double num2){

         double sum = num1 + num2;
        return sum; // return = num1 + num2;
    }
      public static double minus(double num1, double num2){
         double sum = num1-num2;
         return sum;
      }

    public static double multiply(double num1, double num2){
        double sum = num1 * num2;
        return sum;
    }


    public static double divide (double num1, double num2){
        double division = num1 / num2;
        return division;
    }
}
