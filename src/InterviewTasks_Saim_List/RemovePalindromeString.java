package InterviewTasks_Saim_List;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RemovePalindromeString {
    public static void main(String[] args) {


        LinkedList<String> list1 = new LinkedList<>();
        list1.addAll(Arrays.asList("madam","book","civic","odo","java"));
                  remove(list1);
    }

    public static void remove(List<String>list){

       Iterator<String> it = list.iterator();
       while(it.hasNext()){
           String word = it.next();
           String rev = "";

           for (int i = word.length()-1; i >= 0; i--) {

               rev += word.charAt(i);

           }
           if(word.equalsIgnoreCase(rev)){
               it.remove();
           }
       }
        System.out.println(list);

    }

}
