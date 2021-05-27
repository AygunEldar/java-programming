package again_again;

public class Class25_ForLoop {
    public static void main (String [] args ){


        for(int i = 0; i < 5;i++){
            System.out.println("Hello " +i);
        }
        System.out.println("******************************");

        String myStar = " ";
        for(int stars =1; stars <=15;stars++){
            myStar +=" * ";

        }
        System.out.println("My star" + myStar.trim());
    }
}
