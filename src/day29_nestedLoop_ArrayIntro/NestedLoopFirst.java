package day29_nestedLoop_ArrayIntro;

public class NestedLoopFirst {
    public static void main (String [] args ){



        for(int minutes=1; minutes <= 5; minutes++){
            System.out.println();
            for(int seconds =1; seconds <=60; seconds++){
                System.out.print("\n minutes = " + minutes+  "-seconds = " + seconds);
            }
        }
        System.out.println("***********************************************");

        for(int minutes=0; minutes <= 4; minutes++){
            for(int seconds =1; seconds <=59; seconds++){
                System.out.println( minutes+  ":" + seconds);
            }
        }


    }

}
