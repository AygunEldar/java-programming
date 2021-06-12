package day52_inheritance;

public class Discord extends MobileApp{

    public void chat(String someone){
        System.out.println("Chatting with "+ someone);
    }
    /*
    override download method
      */
   @Override
    protected  boolean downLoad(){
        System.out.println(" Downloaded Discord 0.0.23 from App Store" +getVersion());
        return true;
    }
    @Override
    public void useTheApp(int minutes){
        super.useTheApp(minutes);
        chat("Ali");
    }
    public void printInfo(){
        System.out.println("App Name = "+getName());
        System.out.println("App Version  = "+getVersion());

    }
}
