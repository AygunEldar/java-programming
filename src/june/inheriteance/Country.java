package june.inheriteance;

public class Country {
    String  boarder ;
    int area;
    public Country(){
        System.out.println("Country constructor");
    }
    public Country(String boarder,int area){
        this.area = area;
        this.boarder =boarder;
    }

    @Override
    public String toString() {
        return "Country{" +
                "boarder='" + boarder + '\'' +
                ", area=" + area +
                '}';
    }
}
