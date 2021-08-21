package InterviewTasks_Saim_List;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RemoveAhmed {
    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.addAll(Arrays.asList("Eric","Evi","ahmed","Ahmed","liz","Ahmed"));
        remove(list);
        }
    public static void remove(List<String> names){
        names.removeIf(n->n.equalsIgnoreCase("Ahmed"));
        System.out.println(names);


    }
}
