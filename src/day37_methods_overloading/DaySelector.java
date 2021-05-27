package day37_methods_overloading;

public class DaySelector {
    public static void main(String[] args) {
        System.out.println(getDayName(4));
        System.out.println(getDayName(5));
        System.out.println(getDayName(10));

        //loop from 1 to 8 and call getDayName with loop variable
        for(int i = 1 ; i <=8;i++){
            System.out.println(i+" = " +getDayName(i));
        }
        //Store getDayName into variable , and print variable
        String today = getDayName(6);
        System.out.println("today is " +today);
        String someDay = getDayName(0);
        if(someDay==(null)){
            System.out.println("some day is null for invalid day");

        }
        System.out.println(getDayNameV2(2));
    }

    public static String getDayName(int day){
        // return String;
         switch(day){
             case 1:
                 return "Monday";
                 //break;//unreachable code here , because return already exits the method
             case 2:
                 return "Tuesday";
             case 3:
                 return "Wednesday";
             case 4:
                 return "Thursday";
             case 5:
                 return "Friday";
             case 6:
                 return "Saturday";
             case 7:
                 return "Sunday";
             default:
                 System.out.println("Invalid day - " +day);
                 return  null;

         }

    }


    public static String getDayNameV2(int day){
        String dayName ;
        switch(day){
            case 1:dayName = "Monday";
            break;
            case 2:dayName = "Tuesday";
                break;
            case 3:dayName = "Wednesday";
                break;
            case 4:dayName = "Thursday";
                break;
            case 5:dayName = "Friday";
                break;
            case 6:dayName = "Saturday";
                break;
            case 7:dayName = "Sunday";
                break;
            default:
                System.out.println("Invalid day - "+ day);
                dayName = null;
        }
        return dayName;
    }

    }





