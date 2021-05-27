package day35_methods_with_param;
import   java.util.*;

public class

MultipleParamsScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 doubles: ");
        double d1 = scan.nextDouble();
        double d2 =scan.nextDouble();

        showSum(d1, d2);
        showSum(10.02,56.3);
        showSum (12.8,9.14);
    }
    public static void showSum(double num1,double num2){
        double sum =num1 + num2;
        System.out.println("The sum = " + sum);
    }

}
