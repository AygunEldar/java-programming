package day59_polymorphism_exceptions;

public class WebElementUtil {



        /**
        method with polymorphic parameter
        WEbElement element and can accept
         any child class object like Link, InputField etc
         clickElement(new Link());
         clickElement(new InputField());
         WebElement element = new InputField();
         */
       public static void  clickElement(WebElement element){
        System.out.println("Clicking on Element");
        element.click();
    }

    public static WebElement getLinkWithText(String txt){
        System.out.println("Searching for a link  with txt " + txt);

        return new Link();
    }
}
