package day12_conditional_statements;

public class IfElsestatement {
    public static void main (String [] args ){

        if (10 > 5) {
            System.out.println("Condition is true ");
        } else {
            System.out.println("Condition is false ");
        }

        int count = 25 ;
        if (count > 30) {//false
            System.out.println("Count if more than 30 ");
        } else{
                System.out.println("Count is less than 30 ");
            }
           byte age = 25 ;
        if (age >= 18){
          System.out.println("You can vote ");
          System.out.println("Age is greater or equal to 18");

        }
          else{
            System.out.println("Not eligible to vote");
            System.out.println("Age is less than 18");
        }
    }
}
