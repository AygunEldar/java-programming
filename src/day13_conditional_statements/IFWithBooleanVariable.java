package day13_conditional_statements;

public class IFWithBooleanVariable {
    public static void main(String[] args) {

 boolean isHungry = false;
  //(!isHungry ) (isHungry = false) (isHungry != true)
 if (!isHungry){
     System.out.println("I am hungry I will go get something to eat .");
     System.out.println("Then code java.");
 }else{
     System.out.println("I am not hungry, lets keep eat coding java");
 }
        double price = 130.44;
       boolean isAffordable = price <200;
       if (isAffordable){
           System.out.println("I can afford it.");
       }else{
           System.out.println("I can not afford it.");
       }

       boolean isRemoteJob = true;
       if(!isRemoteJob){
     System.out.println("Sorry I am not interested ");
       }else{
           System.out.println("Sure I am interested, what is the interview process?");
       }
    }
}
