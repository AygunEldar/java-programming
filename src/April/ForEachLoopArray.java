package April;

public class ForEachLoopArray {
    public static void main (String [] args){
         int [] data ={45, 89, 23, 98, 65};
         for( int each   : data ){                            //each loop
             System.out.print(each +" ");
         }
        System.out.println("********for loop**********");
   for(int i = 0; i < data.length;i++){
                                                             //for loop
       System.out.println(data[i]);
   }
        System.out.println("------------print -last value-----------------");

        System.out.print("last value " +data[data.length-1]);
        System.out.println();

        System.out.println("**********all values backwards*****************");

        for(int k = data.length-1; k >= 0; k--){

            System.out.print(data[k] + " ");
        }


    }
}
