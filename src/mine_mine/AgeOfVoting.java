package mine_mine;
 import  java.util.Scanner;
public class AgeOfVoting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you eligible to vote for president election? -");
        int age = scan.nextInt();
        boolean eligible = age >= 18;

        if(age >= 18){
            System.out.println("You are eligible to vote ");
        }else{
            System.out.println("Sorry, You are under the age to vote.");
        }
    }

}
