package day29_nestedLoop_ArrayIntro;

public class Arrays_intro {
    public static void main (String [] args){
//int num =10;-- single variable
        int [] nums = new int [3]; //array variable
    nums [0] = 5;
    nums [1] = 7;
    nums [2] = 10;
        System.out.println("value at index 0 = " +nums[0]);
        System.out.println("value at index 1 = " +nums[1]);
        System.out.println("value at index 2 = " +nums[2]);
 int i =0;
        System.out.println(nums[i]);//5
    i++;
        System.out.println(nums[i]);//10


        System.out.println("number of elements = " +nums.length);
        int len = nums.length;
        System.out.println("number of elements  = " + len);

        nums [0] = 100;
        nums [1] = 300;
        nums [2] = nums[1];
        System.out.println("value at index 0 = " +nums[0]);
        System.out.println("value at index 1 = " +nums[1]);
        System.out.println("value at index 2 = " +nums[2]);

    }
}
