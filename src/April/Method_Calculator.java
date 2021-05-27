package April;

public class Method_Calculator {
    public static void main(String[] args) {

        System.out.println("Add 2 + 3 = " +Method_Calculation.add(2,3));
        System.out.println("Subtraction of 6 - 2 is = " +Method_Calculation.minus(6,2));
        System.out.println("Multiplication of 6 * 2 is = " +Method_Calculation.multiply(6,2));
        System.out.println("Division of 6 / 2 is = " +Method_Calculation.divide(6,2));




        double d1 = 56.23;
        double d2 = 89.45;
        double result = Method_Calculation.add(d1, d2);

        System.out.println("Result of the expression is " +result);
    }
}
