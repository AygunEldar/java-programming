package day52_inheritance;

public class Instagram extends MobileApp{

    public void postPhoto(){
        System.out.println("Posting photo on Instagram");
    }
    @Override
    public void useTheApp(int minutes){// instead of void discord it is called covariant
        super.useTheApp(20);
        System.out.println("using instagram app features ");
        postPhoto();

    }
}
