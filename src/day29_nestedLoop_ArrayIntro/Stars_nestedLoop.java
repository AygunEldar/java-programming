package day29_nestedLoop_ArrayIntro;

public class Stars_nestedLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        for (int outer = 1; outer <= 10; outer++) {
            for (int inner = 1; inner <= outer; inner++) {
                System.out.print(" *");
            }
            System.out.println();//go to new/next line
        }
     //   System.out.println("**************************************");
        for (int outer = 1; outer <= 10; outer++) {
            for (int inner = 10; inner >= outer; inner--) {
                System.out.print(" *");
            }
            System.out.println();//go to new/next line
        }

    }
}