package officehour03_29_;

public class Sandwich {
    public static void main(String[] args) {

        String str = "breadjambread";

        if(str.contains("bread")){

            int firstBread = str.indexOf("bread");
            if(str.substring(firstBread+5).contains("bread")){
                int secondBread = str.lastIndexOf("bread");
                System.out.println(str.substring(firstBread+5,secondBread));
            }


        }else{
            System.out.println("nothing");
        }




    }
}
