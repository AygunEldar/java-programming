package day18_conditions_practice_strings_intro;

public class SwitchSeasonFinder {
    public static void main(String [] args ){
         int month = 10;
         //if (month ==12 || month == 1 || month == 2){
        //  System.out.println("Winter");
        // }else if(month ==3 || month ==4 || month ==5)
        // System.out.println("Spring");
        //} else if(month ==6 || month ==7 || month ==8){
        // System.out.println("Summer");
        //


         switch(month){
                 case 12: case 1: case 2:
                 System.out.println("Winter");
                 break;
             case 3:  case 4:  case 5:
                 System.out.println("Spring");
                 break;
             case 6:
             case 7:
             case 8:
                 System.out.println("Summer");
                 break;
             case 9:
             case 10:
             case 11:
                 System.out.println("Fall");
                 break;
             default:
                 System.out.println("Invalid month- " + month);
         }

        System.out.println(month + " is month");
    }
}
