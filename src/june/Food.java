package june;

public class Food {
    String type;
    int num;
    public void count(){
        System.out.println(type +" "+ num);
    }
    public void SetType(){
        System.out.println(type+" is a national meal");
    }
    public void SetService(){
        System.out.println("We can cook it for you");
    }
}
