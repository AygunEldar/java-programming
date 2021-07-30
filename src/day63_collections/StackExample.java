package day63_collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {


        //LIFO last in first out
        Stack<String>bookStack = new Stack<>();

        bookStack.add("Harry Potter");
        bookStack.push("cucumber");
        bookStack.add("Leaders eat last");
        bookStack.add("Java Intro");
        bookStack.push("SQL");

        System.out.println(bookStack);

        System.out.println("This is at the top of the stack "+bookStack.peek());

       // System.out.println(bookStack.remove(0));

        //bookStack.pop();//removes and returns the top of the stack item
        //System.out.println(bookStack.pop());

        System.out.println(bookStack.peek());
        System.out.println("Final versions: "+bookStack);
    }
}
