package mine_mine;
import  java.util.Scanner;
public class SalaryAmount {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Salary amount: ");
        double salary = scan.nextDouble();
        boolean fullTime = scan.nextBoolean();


        if(fullTime ){

            System.out.println("They are full time. Their salary is: $ " + (salary +20000));

        }else{

            System.out.println("They are part time .Their salary is:  $ " + (salary -5000));
        }


    }

}
