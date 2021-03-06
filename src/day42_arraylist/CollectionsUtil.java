package day42_arraylist;
import java.util.*;

public class CollectionsUtil {
    public static void main (String [] args ){

        List<Character>letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j', 'a', 'v', 'a', 'i','s','f', 'u', 'n'));
        System.out.println("size = " +letters.size());
        System.out.println(letters);

        Collections.reverse(letters);
        System.out.println(" reversed = " +letters);

        //find  count of a in letters
        System.out.println(Collections.frequency(letters, 'a'));

        int vCount = Collections.frequency(letters, 'v');
        System.out.println("vCount = " + vCount);

        System.out.println("Max char = "+Collections.max(letters));
        System.out.println("Min char = "+Collections.min(letters));

        Collections.reverse(letters);
        Collections.replaceAll(letters, 'a','u');
        Collections.replaceAll(letters, 'i','j');

        System.out.println("after replace all = " +letters);

        Collections.sort(letters);
        System.out.println("After sorting = "+ letters);

        List<Integer>nums = Arrays.asList(23, 5, 5, 143, 5, 234, 5, 1,7,-9, 0, 1, 5, 5);
        System.out.println("nums = " +nums);

        Collections.reverse(nums);
        System.out.println("nums after reverse = " + nums);
        
        int max = Collections.max(nums);
        System.out.println("max = " +max );
        
       int min = Collections.min(nums);
       System.out.println("min = " +min);

      int countOfFives =  Collections.frequency(nums,5);
        System.out.println("countOfFives = " + countOfFives);

        int countOfOnes =  Collections.frequency(nums,1);
        System.out.println("countOfOnes = " + countOfOnes);

        Collections.replaceAll(nums,5,50);
        System.out.println("after replaceAll = " +nums);


        Collections.sort(nums,Collections.reverseOrder());
        System.out.println("after reverse sort = " +nums);


        Collections.shuffle(nums);

        System.out.println("After shuffle = " +nums);


    }

}
