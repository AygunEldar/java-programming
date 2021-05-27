package saim_only_03_20;

public class Operators {
    public static void main(String [] args ) {
        int a = 3, b =2;
        long c = (a-- +b)*2 / 3% 2;
             c = ( 3 + 2)* 2 / 3%2;
             c = 10 / 3% 2;
             c = 1;
        System.out.println("c = " + c);

        System.out.println("***************************************");
        int num1 = 10;
        int num2 = num1++ *3+ ++num1 + num1++ %2;
            num2 = 10 *3 +12 + 12 %2;
                num2 =27;
                int biggest = num1 > num2 ?num1 : num2;
        System.out.println("biggest = " + biggest);
                
    }
}
