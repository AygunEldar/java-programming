package officehour03_08;
 import java.util.Scanner;
public class Rectangle {
    //PIC package import class
    public static void main (String [] args ) {
    //hardcoded
        //double length, width;
        //length = 5;
        //width = 3;
           Scanner scan = new Scanner(System.in);
           System.out.println("Enter the length :" );
           double length = scan.nextDouble();
           System.out.println("Enter the width");
           double width = scan.nextDouble();

        double perimeter = 2* (length + width);
        double area = length * width;

        System.out.println("perimeter = " +perimeter);
        System.out.println("area = " +area);
    }
}
