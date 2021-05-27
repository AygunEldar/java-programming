package saim_only_03_24;

public class MiddleChar {
    public static void main (String [] args){

//        String word = "elephant";
//
//        if((word.length()%2==0)){
//            System.out.println(word.substring(word.length()/2-1,word.length()/2+1));
//        }else if(word.length()%2!=0){
//            System.out.println(word.substring(word.length()/2,
//                    word.length()/2+1));
//        }

           String word ="questions";
     if(word.length()%2==0){
         System.out.println(word.substring(word.length()/2-1,word.length()/2+1));
     }else{
         System.out.println(word.substring(word.length()/2,word.length()/2+1));
     }
    }
}
