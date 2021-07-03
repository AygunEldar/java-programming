package july;

public class NestedLoop {
    public static void main(String[] args) {

        for (int month = 1; month <=12 ; month++) {
            for (int days = 1; days<= 30 ; days++) {

                System.out.println(month +" : " +days );
            }
        }
        System.out.println("***********************");

        for (int outer = 10; outer >= 1 ; outer--) {

            for (int inner = 0; inner <= outer ; inner++) {

                System.out.println(inner + " ");
            }
            System.out.println( );
        }


    }
}
