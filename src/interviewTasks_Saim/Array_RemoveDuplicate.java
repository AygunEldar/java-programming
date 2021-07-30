package interviewTasks_Saim;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_RemoveDuplicate {
    public static void main(String[] args) {
int [] arr={1,1,5,8,9,5};
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }
         //solution 1
    public static int[] removeDuplicates(int[] array){
        return Arrays.stream(array).distinct().toArray();
    }


    //solution 2
    

//    public static  int[]removeDup(int[] arr){
//        ArrayList<Integer>list =new ArrayList<>();
//        for(int each : arr){
//            if(!list.contains(each)){
//                list.add(each);
//            }
//        }
//        arr = new int[list.size()];
//        for (int i = 0; i <list.size() ; i++) {
//            arr[i] = list.get(i);
//        }
//        return  arr;
//    }
}
