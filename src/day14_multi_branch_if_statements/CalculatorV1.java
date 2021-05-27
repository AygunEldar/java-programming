package day14_multi_branch_if_statements;

public class CalculatorV1 {
    public static void main (String [] args ){
        double num1 = 15.6;
        double num2 = 10.2;
        char operator ='*';

        if(operator=='+'){
            System.out.println(num1 + num2);

        }else if(operator=='-'){
            System.out.println(num1 - num2);

        }else if(operator=='*'){
            System.out.println(num1 * num2);

        }else if(operator=='/') {
            System.out.println( num1 / num2);
        }else{
            System.out.println("Problem is wrong" + operator);
        }
    }

}
