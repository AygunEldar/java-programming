package saim_only_03_20;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class PersonalInformation {
    public static void main(String [] args){

//[Personal Information - Scanner and If]
//        Ask the user how many people they live with?
//        if user lives with Less than 2 people: print "Live with less than 2 people"
//        if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
//        if the user lives with more than 6 people: print "Live with "more than 6 people"
//        Ask the user what city they live in?
//        Ask the user if the live in downtown ("yes or no")
//        if you live downtown, ask them have you thought about moving to the suburbs? ("yes or
//        no")
//        if they have thought about it print "do it its great", if they have not print "You should
//        think about it"
//        Ask the user their favorite animal?
//        Print "Wow %animal is a great animal"
//        Ask the user how many pets they want?
//        Print "Interesting, do you want %numberOfPets %favoriteAnimals?"

  Scanner scan = new Scanner(System.in);
  System.out.println("How many people do live with? ");

  int numOfpeople = scan.nextInt();
  if (numOfpeople < 2) {
      System.out.println("Live less than with 2 people");
  } else if(numOfpeople >=3 && numOfpeople <= 6){
          System.out.println("Live with 3 -6 people");
      }else if (numOfpeople > 6){
      System.out.println("Live with  more than 6 people ");
  }

        System.out.println("What city do you live in?");
        String city = scan.nextLine();
          scan.nextLine();
        System.out.println("Do you live in downtown");
        String down= scan.next();

  if(down.equals("yes")){
      System.out.println("have you thought about moving to the suburbs");
       String moving =scan.next();
      if (moving.equals("yes")) {
          System.out.println("Do it is great");
      } else {
          System.out.println("You should think about it");
      }

  }


        System.out.println("What is your favourite animal?");
        String pet=scan.next();
        //scan.nextLine();
        System.out.println("Wow " +pet +" is a great animal");
        System.out.println("How many pets do you want?");

         int animalNum = scan.nextInt();
        System.out.println("Interesting, do you want "+animalNum+""+pet);


















    }
}
