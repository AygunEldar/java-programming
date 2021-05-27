package April;

public class StarsWars {
    public static void main (String [] args){

        for(int star =1; star <= 7; star++){
            for(int sky =1; sky <= 10; sky++){
                System.out.print(" * ");
            }
            System.out.println();
        }
         for(int a =1; a <= 10; a++){
             for(int b = 1; b <= a; b++){
                 System.out.print(" * ");
             }
             System.out.println();
         }
            for(int a = 1; a <= 10;a++){
                for(int c =10;c >=a;c--){
                    System.out.print(" * ");
                }
                System.out.println();
            }

    }
}
