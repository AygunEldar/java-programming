package officehour03_22_;
import java.util.Scanner;

public class Next_NextLine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        System.out.println("Enter your name");
        input.nextLine();
         String name = input.nextLine();

        System.out.println(number);
        System.out.println(name);

    }
}
