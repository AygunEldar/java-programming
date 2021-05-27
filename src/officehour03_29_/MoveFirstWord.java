package officehour03_29_;

public class MoveFirstWord {
    public static void main(String[] args) {

        String str ="Java is fun language";
        //str =str.trim(); if  "  java is fun"
        int space = str.indexOf(" ");
        String firstWord =str.substring(0,space);
        System.out.println(str.substring(space+1)+" " +firstWord);


    }
}