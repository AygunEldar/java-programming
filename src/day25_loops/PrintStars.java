package day25_loops;

public class PrintStars {
    public static void main(String[] args) {

        for(int star =1; star <=15;star++){
            System.out.print("\uD83C\uDF1F ");

        }

        System.out.println();//star new line
        String myStars ="";
   for(int n=1; n<=5;n++) {
       //myStars = myStars+"* ";
       myStars +="* ";

   }
        System.out.println("my stars "+myStars.trim());


    }
}
