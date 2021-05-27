package saim_only_03_15;

public class Author {
    public static void main(String[] args) {
        String genre ="Science Fiction";
       int averPageLength= 500;
      double  averProfit= 0.0;
      int  averNumOfSequels= 0;
      int averNumOfCountries = 0;
      switch(genre) {
          case "Fantasy":
              System.out.println("Book information:");
              genre = "Fantasy";
              averPageLength = 500;
              averProfit = 1000000.0;
              averNumOfSequels = 5;
              averNumOfCountries = 50;
              break;
          case "Detective":
              System.out.println("Book information:");
              genre = "detective";
              averPageLength = 350;
              averProfit = 700.000;
              averNumOfSequels = 3;
              averNumOfCountries = 45;
              break;
          case "Science Fiction":
              System.out.println("Book information:");
              genre = "science fiction";
              averPageLength = 720;
              averProfit = 900.000;
              averNumOfSequels = 4;
              averNumOfCountries = 30;
              break;
          case "Short story":
              System.out.println("Book information:");
              genre = "short story";
              averPageLength = 150;
              averProfit = 300.000;
              averNumOfSequels = 1;
              averNumOfCountries = 40;
              break;
      }
          System.out.println("Genre of the book: " + genre);
          System.out.println("Number of sequels: " + averNumOfSequels);
          System.out.println("Profit: " +averProfit+ "\nPage length: " +averPageLength + " pages"+
                  "\nPublished countries: more than "+ averNumOfCountries+" countries");


    }
}
