package mine_mine;

public class BooleanExpessions {
    public static void main (String [] args ){


        int num = 25;
        boolean divisor1 = num % 2 == 0;
        boolean divisor2 = num % 3 == 0;
        boolean  divisor3 = num /5 == 5;

        System.out.println( num + " is divisible by 2: " + divisor1);
        System.out.println( num + " is divisible by 3: " + divisor2);
        System.out.println( num + " is divisible by 5: " +divisor3 );
    }
}
