package day17_ternary_nested_condition;

public class TernaryExamples {
    public static void main(String[] args) {
        int score1= 50;
        
        
        String result1 ;
        if(score1 > 60){
            result1 = "Pass";
        }else{
            result1= "Fail";
            System.out.println("result1 = " + result1);
        }
        System.out.println("************************************");
        int score =58;
        String result = (score > 60) ? "Pass" : " Fail";
        System.out.println("result = " + result);

        System.out.println("***************************************");
        String quality = "bad";
        System.out.println(quality.equals("good") ? 100 : 0);
        int rating = quality.equals("good") ? 100 : 0;
        System.out.println("rating = " + rating);

        System.out.println("*********************************");
        int score3 = 100;
        char grade = (score3 > 90) ? 'A' : 'B';
        System.out.println("grade " + grade);

        System.out.println("********************************");

        int num1= 10;
        int num2 =30;
        int max = num1 > num2 ? num1 : num2;
        
        
    }
}
