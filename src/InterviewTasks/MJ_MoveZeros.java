package InterviewTasks;

import day41_arraylist.ArraysAsList;

import java.util.Arrays;
import java.util.LinkedList;

public class MJ_MoveZeros {
    public static void main(String[] args) {

        int [] nums = {3, -7, 0, 0, 1, 0, -2, 0, 6, 0,9};

     //   System.out.println((Arrays.toString(moveAllZerosToTheEnd(nums))));
       moveAllZerosToTheFront(nums);

    }

    //move Zeros
    //move zeros to the end of array
    //move zeros to the first of array
    //int [] nums = {3, -7, 0, 0, 1, 0, -2, 0, 6, 0}
    public static  int[] moveAllZerosToTheEnd (int [] array){

        int[] allZerosToEnd = new int [array.length];

        for (int i = 0, j = 0; i < array.length; i++) {

            if(array[i] != 0){

                allZerosToEnd[j++] =array[i];

            }
        }
        return allZerosToEnd;
    }

    //MOVE ZEROS TO THE  FRONT

    public static void  moveAllZerosToTheFront (int [] array){

             LinkedList<Integer> list =new LinkedList<>();

        for (int i = 0; i < array.length ; i++) {

            if(array[i] !=0){

                list.addLast(array[i]);

            }else{

                list.addFirst(array[i]);
            }

        }
        System.out.println(list);


    }


}
