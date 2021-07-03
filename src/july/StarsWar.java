package july;

public class StarsWar {
    public static void main(String[] args) {

//        for (int outer = 0; outer <= 5 ; outer++) {
//            for (int inner = 0; inner <=10 ; inner++) {
//
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
        for (int outer = 0; outer <=7 ; outer++) {
            for (int inner = 0; inner <=outer ; inner++) {
                System.out.print(" * ");

            }
            System.out.println();
        }

        for (int outer = 1; outer <=7 ; outer++) {
            for (int inner = 7; inner >=outer ; inner--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
