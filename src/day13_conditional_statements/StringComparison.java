package day13_conditional_statements;

public class StringComparison {
    public static void main(String[] args) {

        String city = "Baku";

        if(city.equals("Baku")){
            System.out.println(city + " is the capital of AZERBAIJAN.");
        }else{
            System.out.println(" It is not Baku.");
        }
        String weather = "sunny";
        if (weather.equals("sunny")){
            System.out.println("Lets code java");
        }else{
            System.out.println("Stay and code java!");
        }
    }
}
