package April;

public class Method_Calculation {
    public static void main(String[] args) {
        System.out.println("result of addition is ->>> " +add(4,5));
        System.out.println("result of subtruction is ->>> " +minus(10,5));
        System.out.println("result of multiplication is ->>> " +multiply(4,5));
        System.out.println("result of division is ->>> " +divide(45,5));
    }
    public static double add(double num1,double num2){

        double result = num1 + num2;
        return result;
    }
    public static double minus(double num1,double num2){

        double result = num1 - num2;
        return result;
    }
    public static double multiply (double num1,double num2){

        double result = num1 * num2 ;
        return result;
    }
     public static double divide (double num1, double num2){

        double result = num1 / num2;
        return result;
     }
}
