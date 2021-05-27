package day24_loops;

public class WhileLoopReverse {
    public static void main(String[] args) {

        int count =5;

        while(count >=0){

            System.out.println("Count = " +count);
            count--;

        }
        System.out.println("Finished counting");

        System.out.println("*************************************");

        int unreadSMS = 10;
        System.out.println("I've total " + unreadSMS +"unread SMS");
        while(unreadSMS >=1){    //>0
            System.out.println("Reading SMS " + unreadSMS);
            unreadSMS--;
        }

        System.out.println("All SMS finished");
    }
}
