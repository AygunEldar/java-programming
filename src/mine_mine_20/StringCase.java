package mine_mine_20;

public class StringCase {
    public static void main (String [] args){

        String name = "Brenda";
        System.out.println(name.equalsIgnoreCase("BrenDa"));
        System.out.println(name.equalsIgnoreCase("brEnDa"));
        System.out.println(name.equalsIgnoreCase("bren da"));
        System.out.println(name.equalsIgnoreCase("Brennda"));

        System.out.println("******************************************");

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        if(name.toLowerCase().equals("Brenda")){
            System.out.println(" true");
        }else{
            System.out.println("false");
        }
    }
}
