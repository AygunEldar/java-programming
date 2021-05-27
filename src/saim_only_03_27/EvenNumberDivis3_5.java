package saim_only_03_27;

public class EvenNumberDivis3_5 {
    public static void main(String[] args) {

        for(int num=1; num <=100; num++){
            if(num %2==0 && num %3 ==0 && num % 5==0){
                System.out.println("Even number " + num+ " can be divided by 3 and 5");
            }
        }

    }
}
