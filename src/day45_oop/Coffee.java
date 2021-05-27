package day45_oop;

public class Coffee {

    int  amount;

    /**
     * can be 0 - 100 as a percentage
     */

    String type;

    @Override
    public String toString() {
        return "Coffee{"
                +"amount=" + amount +
                ", type='" + type + '\'' +
                '}';
    }

    public void refill(){
        amount = 100;
      //  System.out.println("current amount " +amount);
    }
    public void drink(int someAmount){
       amount -= someAmount;
    }

    public int getAmount(){
        return  amount;
    }
    public void setType(String newType){
        type = newType;

    }
    public String getType(){
        return type;
    }
}
