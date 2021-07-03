package day59_polymorphism_exceptions;

public class InputField implements WebElement{

public static final String TAG_NAME = "input";


    @Override
    public void sendKeys(String txt) {

        System.out.println("Typing into input field - " + txt);
    }

    @Override
    public void click() {

        System.out.println("Clicking on inputField");
    }

    @Override
    public String getText() {
        System.out.println("Getting text of input field");

        return null;
    }

   public String getValue(){
       System.out.println("getting value in the input");
         return "selenium";
    }
}
