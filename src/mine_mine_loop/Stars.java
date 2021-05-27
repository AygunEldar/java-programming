package mine_mine_loop;
import java.util.*;

public class Stars {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        String star= "";
        for(; i<=n;i++){
            star+="*";
            System.out.println(star);
        }
    }
}
