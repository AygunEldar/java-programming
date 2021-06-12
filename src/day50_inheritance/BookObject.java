package day50_inheritance;

public class BookObject {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Intro to Java";
        book.author = "Murodil";
        book.type = "Programming";
        book.price = 85.0;


        System.out.println(book.title);
        System.out.println(book.author + " wrote " + book.title + " for " +
                book.type + " and price is $ " + book.price);


        AudioBook audioBook = new AudioBook();
        audioBook.author = "Unmesh";
        audioBook.length = 60;
        audioBook.price = 96.0;
        audioBook.narrator = "Brenda";
        audioBook.title = "Selenium Cook Book ";
        audioBook.type = "Automation";
        audioBook.listen();


        EBook eBook = new EBook();
        eBook.title = " Java Data Structure";
        eBook.author = "Murodil and Gurhan";
        eBook.type = "Programming";
        eBook.price = 85.0;
        eBook.page= 1000;
        eBook.size = 2;
        eBook.readBook();
    }
}