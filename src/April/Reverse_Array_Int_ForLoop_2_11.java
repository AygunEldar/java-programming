package April;

public class Reverse_Array_Int_ForLoop_2_11 {
    public static void main(String[] args) {

        for (int i = 1, j = 1; i <= 4; i++, j++) {  // one way
            System.out.println("i = " + i + "; j = " + j);
        }

        System.out.println("---------------------------------------");
        for (int i = 0,j = 5; i <= 5; i++,j--){

            System.out.println("i = " + i + "; j = " + j);
        }
    }
}