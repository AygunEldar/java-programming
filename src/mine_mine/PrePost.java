package mine_mine;

public class PrePost {
    public static void main (String [] args ){


        int a = 5;
        int b = a++ + a-- +a * 2 + a +  ++a;
        // b =  5 + 6 + 10 + 5 + 6  = 32;
         //  a = 6;  b= 32;

       // int a = 200;
       // int b = -a++ + - --a * a-- %2 + a;
        //   b = -200 + - 200 * 200 %2 + 199;
        //   -200 + - 40000 % 2 + 199;
        // -200 + -0 + 199;
           //   -1;
            // a = 199 ;



        int x = 300;
        int y = 400;
        int z = x + y - x * y + x / y;
        //  z = 300 + 400 - 300 * 400 + 300 / 400 ;


    }
}
