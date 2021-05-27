package day14_multi_branch_if_statements;

public class LogicalANDOperator {
    public static void main(String [] args ){

        System.out.println(true && true); //true
        System.out.println(false && true); // false
        System.out.println(true && false); //false
        System.out.println(false && false);//false

        System.out.println("***************");

        System.out.println( 10 > 5 && 1==1);
        System.out.println( 9 < 12 && 8 > 11);
        System.out.println( 5.15 == 4 && 7< 9);
        System.out.println( 6 > 7 && 9 < 5.3);

        System.out.println("---------------------");


        int apples = 10, oranges = 5;
        boolean check = apples > 5 && oranges > 3;
        System.out.println("check : "+ check);

        if (apples > 6 && oranges > 2){
            System.out.println("I have enough fruits");
        }else{
            System.out.println("I need to go to shopping.");
        }
    }
}
