package day35_methods_with_param;

public class MethodsWithParam_Inputs {
    public static void main(String[] args) {
        displayValue(7);
        displayValue(77);
        displayValue(85);
        int count =55;
        displayValue(count);//as if num = count
        int num2 = 10;
        displayValue(num2);
        greetByName("Adil");
        greetByName("Brenda");
        greetByName("Anna");
        String name = "Suleyman";
        greetByName(name);
    }
   public static void displayValue(int num){
       System.out.println("value is "+num);
   }

     public static void greetByName(String name){
         System.out.println("Hello "+name + ", how are you today?");
     }
}
