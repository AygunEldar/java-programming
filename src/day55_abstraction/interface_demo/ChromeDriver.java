package day55_abstraction.interface_demo;

public class ChromeDriver implements  WebDriver{

    public ChromeDriver(){
        System.out.println("Launching Chrome Browser");

    }

    @Override
    public void get(String url) {
        System.out.println("Chrome Driver  - navigating  to " + url);
    }

    @Override
    public void findElement(String locator) {


        System.out.println("Chrome Driver - locating element by " +locator);
    }

    @Override
    public void quit() {
        System.out.println("Chrome Driver  - quitting the driver");

    }

    @Override
    public String getTitle() {
        return "Wooden spoon";
    }


}
