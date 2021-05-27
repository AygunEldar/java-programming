package saim_only_03_15;
 import java.util.Scanner;

public class BakingContest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE SCORES");
        int judgeScore1,judgeScore2,judgeScore3,oPerScore1,oPerScore2;

      //  System.out.println("Enter judge score: "+judgeScore1);
        judgeScore1= scan.nextInt();

       // System.out.println("Enter judge score: "+ judgeScore2);
         judgeScore2= scan.nextInt();

       // System.out.println("Enter judge score: "+ judgeScore3);
         judgeScore3= scan.nextInt();

      //  System.out.println("Enter other 2 person's score: "+ oPerScore1);
         oPerScore1= scan.nextInt();

        System.out.println("Enter other 1 person's score: ");
         oPerScore2= scan.nextInt();

        int myScore = (judgeScore1 +judgeScore2+judgeScore3)/3;
        System.out.println(myScore);

        if (myScore > oPerScore1 && myScore > oPerScore2){
            System.out.println("First place!");
        }else if(myScore>oPerScore1 && myScore<oPerScore2){
            System.out.println("Second place");
        }else{
            System.out.println("Third place");
        }
    }
}
