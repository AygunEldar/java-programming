package mine_mine_loop;

public class ABC_CBA {
    public static void main(String[] args) {

        char letter = 'a';
        while (letter <= 'z') {
            System.out.print(letter+" ");
            letter++;

        }

        System.out.println();
         letter ='z';
        while (letter >= 'a') {
            System.out.print(letter+" ");
            letter--;
        }
    }
}
