package saim_only_03_22;

public class Address {
    public static void main(String[] args) {
        String address = "231332 leaf ave,lake city 3132";

        if(address.isEmpty()){
            System.out.println("No address found");
        }else{
            System.out.println(address.toUpperCase());
        }

    }
}
