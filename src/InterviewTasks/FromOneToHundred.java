package InterviewTasks;

public class FromOneToHundred {
    public static void main(String[] args) {
         printNum(1);

    }
    public static void printNum(int num){

        System.out.print(num +" ");
        num++;
        if(num <= 50){
            printNum(num);
        }
    }

}
