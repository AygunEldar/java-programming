package April.ElgunAZE;
import java.util.*;

public class SimpleCompoundNumArr {
    public static void main(String[] args) {
        int num [] = {14, 11, 18, 7, 17, 12, 9, 24};
    int temp= 0;

for(int i =0;i < num.length; i++){
    if(num[i] %2 !=0 && num[i+1]%2 == 0){

        num[i] =temp;
        temp =num[i +1];
       // num[i +1] =num[i];
    }
    System.out.print(num[i]);
}
//        demeli burda num arrayin sade ededlerini ozunden sonra gelen murrekkeb ededi ile yerlerini deyismek lazimdir.
//
//                Yeni 11 18 le yerini deyisecek
//        17 12 ile
//        9 24 Le
//        Out put bele olmalidir --->>>>    [14, 18, 11, 7, 12, 17, 24, 9]




    }
}
