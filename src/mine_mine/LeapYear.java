package mine_mine;

public class LeapYear {
    public static void main ( String [] args ){

        int year = 2009;
       // int leap = year / 4;

        if ( year % 4 ==0){
            System.out.println("This year is a leap year. ");

        }else{
            System.out.println("This year is not a leap year. ");
        }
    }
}
