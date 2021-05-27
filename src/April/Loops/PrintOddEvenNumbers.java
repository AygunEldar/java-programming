package April.Loops;

public class PrintOddEvenNumbers {
    public static void main(String[] args) {

        for (int i = 1;i <= 100;i++){
            int even ;
            //even =i % 2 ==0;
            if(i % 2 ==0){
                System.out.println("even numbers - " +i);
            }else{
              //  System.out.println("odd numbers - " +i);
            }
        }
    }
}
