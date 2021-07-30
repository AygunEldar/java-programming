package day63_collections;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        //list -> ArrayList

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);
        System.out.println(set);

        Set<String> words = new HashSet<>();
        words.add("hello");
        words.add("world");
        words.add("java");
        words.add("java");
        words.add("collections");
       words.remove("world");

        System.out.println(words);

        for(String each : words){

        }

        //convert your Set to a list
        List<String> wordList = new ArrayList<>(words);
        wordList.add("world");
        System.out.println(wordList);

        //LinkedHashSet

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("24");
        linkedHashSet.add("java");
        linkedHashSet.add("#$");
        linkedHashSet.add("53");
        linkedHashSet.add("apple");
        linkedHashSet.add("53");
        linkedHashSet.add("java");
        linkedHashSet.add("cucumber");

        System.out.println(linkedHashSet);
        System.out.println();

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("24");
        treeSet.add("java");
        treeSet.add("#$");
        treeSet.add("53");
        treeSet.add("apple");
        treeSet.add("53");
        treeSet.add("java");
        treeSet.add("Cucumber");

        System.out.println(treeSet);

//        ((TreeSet)treeSet).first();
//        System.out.println(treeSet);

    }


}
