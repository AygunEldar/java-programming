package saim_only_04_03;

public class BookValue {
    public static void main (String [] args){

       String book = "Java textbook By Murodil. Chapter 1 datatypes and variables." +
               " Chapter 2 conditional statements. chapter 3 String manipulation. " +
               "Chapter 4 Loops. Chapter 5 Arrays. Chapter 6 Methods. chapter 7 ArrayList. chapter " +
               "8 instance and static. Chapter 9 Constructors. Chapter 10 Encapsulation and Inheritance. " +
               "Chapter 11 Abstraction and Polymorphism. Chapter 12 Exceptions. Chapter 13 Collections. " +
               "Chapter 14 Learn more.";

         book = book.toLowerCase();
         int value =0;
         String part ="chapter";

         for(int i= 0; i < book.length();i++){
             if(book.contains(part)){
                 value++;
                 book = book.replaceFirst(part ," ");
             }
         }
              int profit = value *10;
         System.out.println("The value of the book is $ " +profit);
      }

    }

