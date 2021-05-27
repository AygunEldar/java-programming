package day30_arrays;

public class ForLoopArray {
    public static void main (String [] args ) {

        int [] data ={32, 532, 12, 5445, 22, 123, 543, 999, 321, 3};

         for (int each : data ){
             System.out.println(each);
         }

 for (int n : data){
     System.out.print(n + " ");
 }
        System.out.println("---------------FOR LOOP-----------------");
// repeat above with for loop

         for (int i =0; i < data.length; i++){ // +=2;  +=5; only for loop
             System.out.print(data[i]+ " ");
         }
        System.out.println("\n*****************************");

         //print the last value using length
        System.out.println(data[data.length-1]);

        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        //print all number backwards in line
        for(int i =data.length-1; i >=0; i--){
            System.out.print(data[i] + " ");
        }


        }
}
