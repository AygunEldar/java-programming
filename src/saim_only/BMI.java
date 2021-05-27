package saim_only;
import java.util.Scanner;
public class BMI {
    public static void main(String [] args ){
      Scanner scan = new Scanner(System.in);
      System.out.println("Try to be healthy");
        double weight = scan.nextDouble();
        double height = scan.nextDouble();
         double bmi = weight / (height * height);

        if( bmi < 18.5){
            System.out.println("Underweight");
        }else if(bmi == 18.5 && bmi < 25){
            System.out.println("Normal weight");
        }else if( bmi ==25 && bmi < 30){
            System.out.println("Overweight");
        }else{                // if (bmi > 30 || bmi == 30)
            System.out.println("Obese");
        }
    }
}
