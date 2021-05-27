package repls04;
import java.util.*;

public class ReplFindE {
    public static void main (String[]args){

        Scanner scan = new Scanner(System.in);
        String[] arr = {scan.next(),scan.next(),scan.next(),scan.next(),scan.next()};
        System.out.println(Arrays.toString(getWithE(arr)));

    }



    public static String[] getWithE(String[] arr) {

        //TODO : YOUR CODE GOES HERE -------
       // ---------------
        int count = 0;
        for(int i = 0; i <=arr.length;i++){
            if(arr[i].contains("e")){

                count++;

            }
        }
        String [] fewValues = new String[count];
        int n =0;
        for(int k =0; k  < arr.length-1; k++){

            if(arr[k].contains("e")){
                 fewValues[n] = arr[k] ;
                 n++;
            }
        }



        //YOUR CODE ENDS HERE -----------------------

        return fewValues;
    }



}
