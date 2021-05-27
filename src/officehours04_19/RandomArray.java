package officehours04_19;
import java.util.*;
public class RandomArray {
    public static void main(String[] args) {
        int [] a = getRandomArray(5, 50);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(getRandomArray(5, 50)));
    }



    public static int [] getRandomArray(int size, int maxRandomNum){

        Random random =  new Random();
        int [] arr = new int [size];
        for (int i = 0; i < size; i++) {

            arr[i] = random.nextInt(maxRandomNum+1);

        }


        return arr;
    }

}
