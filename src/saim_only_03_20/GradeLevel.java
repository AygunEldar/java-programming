package saim_only_03_20;

public class GradeLevel {
    public static void main(String[] args) {
        byte grade = 5;
        if (grade>=1 && grade <=5){
            System.out.println("Elementary school");
        }else if(grade>=6 && grade <=8){
            System.out.println("Middle school");
        }else if(grade>=9 && grade <=12){
            System.out.println("High school");
        }else if(grade>=13 && grade <=16){
            System.out.println("College");
        }else if(grade==17 || grade ==18){
            System.out.println("Grad School");
        }else{
            System.out.println("Invalid grade level given");
        }





    }
}
