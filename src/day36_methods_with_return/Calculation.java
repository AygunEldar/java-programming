package day36_methods_with_return;

public class Calculation {
    public static void main(String[] args) {
        System.out.println("add 10 +45 = " + Calculator.add(10,45));
        System.out.println("minus 45 -10 = " + Calculator.minus(45,10));
        System.out.println(" multiply  10,45 = " + Calculator.multiply(10,45));
        System.out.println("divide 48/6 = " + Calculator.divide(48,6));

        double d1 = 234.3;
        double d2 = 321.5;
        double result = Calculator.minus(d1,d2);
        System.out.println("result = "+ result);
    }
    public static double minus(int num1 , int num2){

        double result = num1 + num2;
        return result;
    }
}
