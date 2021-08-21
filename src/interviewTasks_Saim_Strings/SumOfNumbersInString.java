package interviewTasks_Saim_Strings;

public class SumOfNumbersInString {
    public static void main(String[] args) {
        System.out.println(getSumOfNums("There are 12 books,3 pens and 8 pencils"));
    }

    public static  int getSumOfNums(String s){

        int sum = 0;
        String [] num = s.replaceAll("[\\D] + "," ").split(" ");

        for(String each : num){
            sum += Integer.parseInt(each);
        }
        return sum;
    }

}
