package saim_only_03_20;

public class MorningOrNight {
    public static void main (String [] args){

        int hour =22;
        if(hour >=0 && hour <=11){
            System.out.println("it is morning");
        }else if(hour>=12 && hour<=24){
            System.out.println("It is night");
        }else{
            System.out.println("Unable");
        }






    }
}
