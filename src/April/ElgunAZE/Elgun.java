package April.ElgunAZE;
import  java.util.*;

public class Elgun {
    public static void main(String[] args) {
//        String str [][] = {{"Mike Artrur","Mike123"},
//                {"Jason Mike","Coole1233"},
//                {"Johnny avard","Avard123"},
//                {"Ford","Fiesta"}};
//
//
//        for(int i =0,j =3; i <=4;i++,j--){
//            //System.out.println(i);
//            System.out.println(j);
//        }

       int num[] ={14, 16, 3, 7, 17, 19, 9};  //16, 7, 17, 19
        for(int i =0; i < num.length; i++){
            if(num[i] < num[i+1]){
                System.out.println(num[i+1]);
            }
        }

    }
}
