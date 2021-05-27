package saim_only_03_17;

public class TernarySport {
    public static void main(String[] args) {


        String sport = "football";
          int fee = sport.equals("soccer") || sport.equals("tennis")  ? 100 :50;

          System.out.println(fee);


    }
}
