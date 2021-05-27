package again_again;

public class ClassYoutube {
    public static void main (String [] args) throws InterruptedException {

        int sec =0;
        while(sec <=117){
            System.out.println("Keep watching");
            sec++;
            Thread.sleep(1000);
        }
        System.out.println("Finished");
    }
}
