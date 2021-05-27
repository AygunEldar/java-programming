package again_again;

public class Class24_Decreasing_Loop {
    public static void main (String [] args ){

        int count=5;

        while (count >=0){
            System.out.println(count);
            count--;

        }
    System.out.println("Finished counting");
        System.out.println("**********************************");

        int unreadSMS =10;
        System.out.println("Total messages "+ unreadSMS);
        System.out.println();
        while (unreadSMS > 0){

            System.out.println("Still reading " +unreadSMS);
            unreadSMS--;
        }

        System.out.println("End of the messages");

    }
}
