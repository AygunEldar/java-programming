package june;

public class FoodObject {
    public static void main(String[] args) {

        Food menu = new Food();
        menu.type = "dolma";
        menu.num = 15;
        menu.count();
        menu.SetType();
        menu.SetService();
    }


}
