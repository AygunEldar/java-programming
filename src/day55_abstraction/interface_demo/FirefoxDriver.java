package day55_abstraction.interface_demo;

public class FirefoxDriver implements WebDriver{


    @Override
    public void get(String url) {
        System.out.println("Firefox Driver - navigating  to " + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("Firefox Driver - locating element by " +locator);
    }

    @Override
    public void quit() {
        System.out.println("Firefox Driver  - quit");
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public String toString(){
        return "Wooden spoon";
    }
}
