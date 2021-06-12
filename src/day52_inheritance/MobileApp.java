package day52_inheritance;

public class MobileApp {
    private String name;
    private double version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }



    protected boolean downLoad(){
        System.out.println("App: "+ name + version +"is downloaded");
        return true;
    }

    public void useTheApp(int minutes){

        System.out.println("using " + name +" app for " + minutes + " minutes");
    }
}
