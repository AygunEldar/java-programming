package day34_void_method;

public class FirstMethod {
    public static void main(String[] args) {
          displayMessage();//1st called the method
        displayMessage();//2nd called  the method
        displayMessage();//3rd called the method
        displayMessage();//4th called the method

        for(int i = 1; i <=100;i++){
            System.out.print(i + " - ");
            displayMessage();
        }

    }
     //first custon reusable method
    public static void displayMessage() {
        System.out.println("Hello B22 friends!");
    }
}
