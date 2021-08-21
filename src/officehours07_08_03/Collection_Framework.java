package officehours07_08_03;

import java.util.*;

public class Collection_Framework {
    public static void main(String[] args) {

        Collection<String> list = new ArrayList<>(); //polymorphic  parent -> child
        List<String>list2 = new ArrayList<>(); //polymorphic
        ArrayList<String>list3 = new ArrayList();  //regular    itself

        list2.add("John");
        list2.add("Stefan");
        list2.add("Irina");

        List<String>list4 = new Stack();

        list4.add("John");
        list4.add("Stefan");
        list4.add("Irina");

        String str1 = ((Stack<String>) list4).pop();
        System.out.println(str1);

//        String str2 = ((Stack<String>) list4).pop();
//        System.out.println(str2);

        System.out.println("***********");
        List<Integer> list5= new Stack<>();
        list5.addAll(Arrays.asList(45,105,2918,459,298,759));

//        Collections.sort(list5);
//        System.out.println(list5.toString());


        for(int i = 0 ; i < list5.size();i++){
            int x = ((Stack<Integer>) list5).pop();
            System.out.println(x);


        }

    }
}
