package june.inheriteance;

public class LandObject {
    public static void main(String[] args) {

        Country  country1= new Country();
        country1.boarder ="Azerbaijan";
        country1.area = 130000;


        City city1 = new City();
        city1.boarder ="Baki";
        city1.area = 15600;

        System.out.println(country1);
        System.out.println(city1);
    }
}
