package InterviewTasks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveAllZerosEnd {
    public static void main(String[] args) {
        int []arr ={1,5,0,9,7,0,6,0,4};
        moveZerosToEnd(arr);
    }
    public static  void  moveZerosToEnd(int [] num){

        LinkedList<Integer> list =new LinkedList<>();
        for (int i = 0; i <num.length ; i++) {
            if(num[i] ==0){
                list.addLast(num[i]);
            }else{
                list.addFirst(num[i]);
            }

        }
        System.out.println(list);
    }

                     //MAX version
    public static List<Integer> moveZerosToTheEnd(List<Integer> list) {
        List<Integer> temp1 = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>();
        for (int each : list) {
            if (each != 0){
                temp1.add(each);
            } else {
                temp2.add(each);
            }
        }
        list = Stream.concat(temp1.stream(), temp2.stream()).collect(Collectors.toList());
        return list;
    }
}
