package saim_only_03_20;

public class HouseOccupants {
    public static void main (String [] args){
        String house= "Tree house";
        int maxOccup =0;
        switch( house){
            case "Tree house":
                maxOccup = 1;
                break;
            case "Mobile home":
                maxOccup =2;
                break;
            case "Apartment":
                maxOccup = 4;
                break;
            case "Town house":
               maxOccup = 6;
                break;
            case "Villa":
                maxOccup = 8;
                break;
            case "Mansion":
               maxOccup = 10;
                break;
            default:
                System.out.println("Invalid house occupation");
        }
        System.out.println("My house type is " + house +", and maximum occupation is "+ maxOccup);
    }
}
