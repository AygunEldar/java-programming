package day34_void_method;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("-Starting ETSy search smoke TEST");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();
    }
    public static void openBrowser(){

        System.out.println("1.Launching Chrome browser");
    }

    public static void navigateToEtsyUrl(){

        System.out.println("2.Navigate to https://www.etsy.com/");
    }
    public static void searchForWoodenSpoon(){

        System.out.println("3.Verify Etsy home page is  displayed");
    }
    public static void verifyResultsAreDisplayed(){
        System.out.println("4.PASS: Search result succesfully displayed");
    }
}
