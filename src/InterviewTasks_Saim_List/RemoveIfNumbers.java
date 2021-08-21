package InterviewTasks_Saim_List;

import day41_arraylist.ArraysAsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RemoveIfNumbers {

    public static void remove(List<Integer> list){
        list.removeIf(n->n >100);

        System.out.println(list);

    }

    public static void main(String[] args) {
      LinkedList list = new LinkedList();
      list.addAll(Arrays.asList(45,563,102,30,303));
      remove(list);
    }
}
