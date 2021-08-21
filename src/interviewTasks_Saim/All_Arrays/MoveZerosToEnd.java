package interviewTasks_Saim.All_Arrays;

import com.sun.scenario.effect.impl.state.LinearConvolveKernel;
import day59_polymorphism_exceptions.Link;

import java.util.LinkedList;
import java.util.List;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int [] arr= {1,0,5,6,9,0,8,0,7,0,40,0,1};
        moveZerosToFront(arr);
        moveZerosToEnd(arr);
    }
    public static void moveZerosToEnd (int[] nums){

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {

            if(nums[i] == 0){
                list.addLast(nums[i]);
            }else{
                list.addFirst(nums[i]);
            }

        }
        System.out.println(list);


    }

    public static void moveZerosToFront(int [] nums1){

        LinkedList <Integer> list1 = new LinkedList<>();

        for (int i = 0; i < nums1.length; i++) {
            if(nums1[i] == 0){
                list1.addFirst(nums1[i]);
            }else{
                list1.addLast(nums1[i]);
            }

        }
        System.out.println(list1);
        }
    }
