package day15_logicalOps_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {

        char grade ='d';

        if (grade=='A' || grade=='B' || grade=='C'){
            System.out.println("Passed with grade " +grade);
        }else if(grade =='D' || grade == 'e'){
            System.out.println("Qualify for retake " +grade);
        }else if(grade =='E' || grade=='e'){
            System.out.println("Failed, try better "+ grade);
        }else{
            System.out.println("Invalid grade " + grade);
        }
        System.out.println("*******************************");

        if ((grade=='A' || grade=='a') ||( grade=='B' || grade == 'b')|| (grade=='C' || grade =='c')){
            System.out.println("Passed with grade " +grade);
        }else if(grade =='D'){
            System.out.println("Qualify for retake " +grade);
        }else if(grade =='E'){
            System.out.println("Failed, try better "+ grade);
        }else{
            System.out.println("Invalid grade " + grade);
        }


    }
}
