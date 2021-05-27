package day25_loops;

public class WhileHungry {
    public static void main (String [] args){

        boolean isHungry =true;
        int bananas = 0;
        int countToFull = 3;
 // while (isHungry && bananas != countToFull)
         while(isHungry){
             bananas++;
             System.out.println("Eat a banana: "+bananas);

   //isHungry = bananas==countToFull ? false : true;
         if(bananas == countToFull) {
             isHungry = false;
         }
         }
        System.out.println("Had enough bananas, let's get back to study");
    }


}
