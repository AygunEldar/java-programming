package day15_logicalOps_switch_ternary;

public class JobOfferSelector {
    public static void main (String [] args){

        String location = "Washington DC";
        double salary = 117_500;
        boolean isRemote = true;
        boolean hasBenefits = true;

        if( location.equals("Washington DC") && salary >=117.500 && isRemote  && hasBenefits){
            System.out.println("Sure I 'll accept this offer");
        }else{
            System.out.println("Let's consider another offer or negotiate");
        }
    }
}
