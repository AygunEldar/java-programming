package mine_mine_20;

public class StartsEnds19 {
    public static void main(String [] args ){

        String word ="reihesting";
        System.out.println(word.startsWith("int"));
        System.out.println(word.endsWith("ing"));
        System.out.println(word.endsWith("ind"));

        if (word.startsWith("inter")){
            System.out.println("It is a long word");

        }else{
            System.out.println("wrong");
        }
        if(word.endsWith("ing")){
            System.out.println("Word with suffix");
        }else{
            System.out.println("it is not right");
        }

        System.out.println("*******************************");

        String man= "Dr.Alizada";
        if(man.startsWith("Mr")){
            System.out.println("Mister");
        }else if(man.startsWith("Ms")){
            System.out.println("Miss");
        }else if(man.startsWith("Dr.")){
            System.out.println("Doctor");
        }else if(man.startsWith("Jr")){
            System.out.println("Junior");
        }else{
            System.out.println("Other abrivation");
        }

        System.out.println("*******************************");
                String url ="https://www.edu.uk";
                if(url.endsWith(".aze")){
                    System.out.println("Azerbaijan");
                }else if(url.endsWith(".ru")){
                    System.out.println("Russia");
                }else if(url.endsWith(".uk")){
                    System.out.println("United Kingdom");
                }else{
                    System.out.println("other country");
                }
    }
}
