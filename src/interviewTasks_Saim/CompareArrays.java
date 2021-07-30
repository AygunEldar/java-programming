package interviewTasks_Saim;

import java.util.ArrayList;

public class CompareArrays {
    /*Compare arrays. Assign values of int arrayOne to int arrayTwo. And then compare if they are same/equal?
            EX: int[] arrayOne = {5, 10, 15, 20}
                int[] arrayTwo = {5, 10, 15, 20}
                and comparision...

     */
    public static  void main (String [] args){
        int [] num1 = {2,4,5,6};
        int[] num2 = {2,4,5,6};
        System.out.println(compareArrays(num1,num2));
    }

 public  static boolean  compareArrays(int[] a, int[] b ){

     for (int i = 0; i < a.length; i++) {
         for (int j = 0; j <b.length ; j++) {
             if(a[i]==b[j]){

             }
         }

     }
     return true;
 }
 //MAX
    /*
    public static void main(String[] args) {
             int[] arrayOne = {5, 10, 15, 20};
            int[] arrayTwo = arrayOne; //{5, 10, 15, 20};
            System.out.println(Arrays.equals(arrayOne, arrayTwo));
            }
     */

}
