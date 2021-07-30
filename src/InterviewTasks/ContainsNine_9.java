package InterviewTasks;

public class ContainsNine_9 {
    public static void main(String[] args) {
        sumAllNines(69,99);
    }
    public static void sumAllNines (int a, int b){
        int sum =0;
        for (int i = a; i <= b ; i++) {
            if(String.valueOf(i).contains("9")){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
