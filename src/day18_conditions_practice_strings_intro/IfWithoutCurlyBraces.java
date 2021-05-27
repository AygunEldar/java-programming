package day18_conditions_practice_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String [] args){

        String todaysClass = "python";
        if(todaysClass.equals("java"))
            System.out.println("Java is fun");
         //System.out.println("java is fun again");
         else
             System.out.println("it is not java.It is "+ todaysClass);


        System.out.println("************************************");
   int score = 1;
   if (score ==1){
       System.out.println("lowest score 1");
   }else if( score==2){
       System.out.println("score is 2");
   }else if(score ==3){
       System.out.println("score is 3");
   }

        System.out.println("------------------------------------");

   int a = 10;
   if (a == 1)
       System.out.println("a is 1");
       System.out.println("1 is a");





    }
}
