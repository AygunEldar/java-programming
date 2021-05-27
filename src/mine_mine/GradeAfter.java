package mine_mine;
import java.util.Scanner;
public class GradeAfter {
    public static void main (String [] args ) {

        Scanner scan = new Scanner(System.in);
        System.out.println("A score of the test: ");

        double score = scan.nextDouble();
        byte attempt = scan.nextByte();
        double first = score-score * 0.1;
        double second = score- score * 0.2;
        double third = score- score * 0.35;

        if(attempt==1){
            System.out.println("After  the first attempt your score: " + first);

        } else if(attempt ==2){
            System.out.println("After the second attempt your score is: " + second);

        }else if (attempt == 3){

            System.out.println("after the third attempt your score is; " +third);
        }





    }
}
