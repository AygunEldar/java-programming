package june.inheriteance;

public class City extends Country {


    public City(){
        super();
        System.out.println("City class constructor");
   }
        public City(String boarder, int area){
            super(boarder, area);
            System.out.println("City class constructor");

    }

    @Override
    public String toString() {
        return "City{" +
                "boarder='" + boarder + '\'' +
                ", area=" + area +
                '}';
    }
}
