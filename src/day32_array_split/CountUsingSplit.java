package day32_array_split;

public class CountUsingSplit {
    public static void main(String[] args) {

        String catTypes = "bengal cat tabby cat persian cat no cat here some other cat type";

        String [] catsArray=catTypes.split("cat");
        System.out.println("Number of cat = " + (catsArray.length-1));

   for(String each : catsArray){
       System.out.println(each);
   }

        System.out.println("***********************************");

        int count= 0;
     for(int i =0; i< catTypes.length()-2;i++){
         if(catTypes.substring(i,i+3).equals("cat")){
             count++;

         }

     }
        System.out.println("Count of the cats are "+count);
    }
}
