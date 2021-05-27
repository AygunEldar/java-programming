package repls04;
import java.util.*;

public class TimeConvertion {

    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);
        String timeConversion = scan.nextLine();
        timeConversion(timeConversion);
    }

    public static void timeConversion(String s) {
        /*
         * Write your code here.
         */
    String [] newArr= s.split(":");
        if(s.contains("AM")){
            s = s.replace("AM","");

            if(Integer.parseInt (newArr[0]) ==12){
                s=newArr[0].replace("12","00");
            }
        }

        if(s.contains("PM")) {
            s = s.replace("PM", "");
          


            if(Integer.parseInt (newArr[0]) ==12) {
                s = s;

            }else if(Integer.parseInt (newArr[0]) != 12) {

                for (int i = 0; i < newArr.length; i++) {
                    s = ((Integer.parseInt(newArr[0]) + 12) + ":" + newArr[1] + ":" + newArr[i]);
                }
            }
        }
        System.out.println(s);




    }

}
