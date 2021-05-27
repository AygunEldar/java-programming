package officehour03_24_;

public class CharIndex {
    public static void main(String[] args) {

        String s = "java";

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));
       // System.out.println(s.charAt(4)); StringIndexOfOutBoundsException

        System.out.println(s.charAt(0) +""+ s.charAt(3));

        String upper = ""+s.toUpperCase().charAt(0) + s.charAt(3);
        System.out.println(upper);


        System.out.println(s.indexOf('a'));//1
        System.out.println(s.indexOf('m'));//-1
        System.out.println(s.indexOf('l'));//-1

        System.out.println(s.contains("j"));
        System.out.println(s.indexOf('j') >= 0 ? "contains" : "not contains");
        System.out.println(s.indexOf('d') >= 0 ? "contains" : "not contains");

        System.out.println(s.toLowerCase().contains("a"));
        System.out.println(s.toLowerCase().startsWith("a"));
        System.out.println(s.toLowerCase().replace("a","o").startsWith("a"));


    }
}
