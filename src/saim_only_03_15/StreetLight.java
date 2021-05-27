package saim_only_03_15;

public class StreetLight {
    public static void main(String[] args) {
        String light ="green";

        switch(light){
            case "green":
                System.out.println("Go");
                break;
            case"yellow":
                System.out.println("Slow down");
                break;
            case "red":
                System.out.println("Stop");
                break;
            default:
                System.out.println("Always be careful");
        }


    }

}
