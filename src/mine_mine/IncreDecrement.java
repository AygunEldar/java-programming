package mine_mine;

public class IncreDecrement {
    public static void main (String [] args ){

        int orange = 5;
                    //1+5  *10 =60 / 5=12 + 5=17
       // int orbask = ++orange * 10 / --orange + orange--;

            //          6 *   10  /    6       +  4
        int orbask = ++orange * 10 / orange-- + --orange;
        System.out.println(orbask);
        System.out.println(orange);


        int a = 9;
        int b = a++;
        System.out.println("A =" +b);
        b = a++ ;
        System.out.println("B =" +b);
        int c =--b;
        System.out.println("C =" +c);
         c = a;
         System.out.println("C = " + c);

         int m = 16;
         int l = --m;
         System.out.println("L = " + l);
          l = m --;
          System.out.println("L1 = " +l);
          System.out.println("M = " + m);

          int fig = 20;
          int fVase = fig++;
          System.out.println("Plate 1 = "+ fVase);
          System.out.println("Fig plate = " +fig);
          fVase = fig--;
          System.out.println("Plate 2 = " +fVase);
          System.out.println("Fig plate 2 = " +fig);
    }
}
