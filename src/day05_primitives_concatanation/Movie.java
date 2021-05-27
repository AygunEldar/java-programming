package day05_primitives_concatanation;

public class Movie {
    public static void main(String [] args ){
        String name = "\"Shooter\"";
        String genre = " action";
        int duration = 275;
        String releaseDate ="January 2021";
        char rating = 'R';
        boolean isaSequels = true;
        int rottentomatoesRating = 90;
        boolean isOnDVD = true;
        System.out.println("Tonight we are streaming" + name+  "which was released on"  +releaseDate);
        System.out.println("This" + genre +"movie" + " got "+ " a "+  rating  +  " on " +" Rotten Tomatoes.");
        System.out.println("The rating is  " + rottentomatoesRating +" and it runs for  " + duration);
        System.out.println("This is a sequel "+ isaSequels + " and is on DVD "+ isOnDVD);
    }
}
