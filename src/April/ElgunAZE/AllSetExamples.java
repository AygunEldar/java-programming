package April.ElgunAZE;

import java.util.*;
import java.util.stream.Collectors;

public class AllSetExamples {
    public static void main(String[] args) {
        Set<Integer> setNumbers = new HashSet<>(Arrays.asList(1,14,52,0,56,12));
        System.out.println(setNumbers);
        Set<Integer> treeSet = new TreeSet<>(setNumbers);
        System.out.println(treeSet);

        System.out.println("======================");

        System.out.println(sortMe(setNumbers));
        System.out.println("=========================");
        List<Integer> number = Arrays.asList(12,0,56,2,1,4,7,8);
        System.out.println(sortMe(number));

        System.out.println("===================================");
        List<Integer> fixedList = Arrays.asList(1,1,2,2,3,3,4,9,5,33,6,9);

        /*
        This method will get unique elements with help of distinct() method
        fixedList.stream().distinct().forEach(each -> System.out.print(each + " "));
         */

        sortElement(fixedList);


    }

    public static Collection<Integer> sortMe(Collection<Integer> collection){
        return collection.stream().filter(n-> n >= 4).sorted().collect(Collectors.toList());
    }

    public static void sortElement(Collection <Integer> collection){
        collection.stream().filter(n -> n >= 0).sorted().forEach(n -> System.out.print(n + " "));
    }
}

