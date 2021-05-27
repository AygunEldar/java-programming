package mine_mine_loop;

public class CountMatches_2 {
    public static void main( String [] args){
         String word="Gobustan";
         char letter ='o';
         int count = 0;

         for(int i= 0; i< word.length();i++){
             if(word.charAt(i)== letter){
                 count++;
             }
         }

        System.out.println("there is " + count +" "+ letter+ " in the name");
    }
}
