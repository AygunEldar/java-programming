package day55_abstraction.exercise_example;

public abstract class Exercise {
    public void start(){
        System.out.println("Warming up and starting the exercise");
    }
    /*
    //abstract method - method without body/imp, just signature
    -purpose: letting sub classes implement/override their own way
     */
    public abstract void perform();

   /*
   another abstract method that concrete sub classes will override/ implement
   minutes- how long is exercise is performed
   number
    */

    public abstract int getCaloriesCount(int minutes);
}
