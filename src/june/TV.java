package june;

public class TV {
    int channel =1;
    int volumeLevel =0;
    boolean on = false;
    String brand = "undefined";

    public TV (){
        System.out.println("Creating TV object using no args-constructor");
    }

    public TV(String brand){
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public void setVolumeLevel(int volumeLevel){
        this.volumeLevel = volumeLevel;
    }

    public int getVolumeLevel(){
        return  volumeLevel;
    }

    public void setChannel(int channel){
        this.channel = channel;
    }

    public int getChannel(){
        return  channel;
    }

    public void setBrand(String brand){
        this.brand =brand;
    }

    public String getBrand(){
        return brand;
    }

    public void channelUp(){
        if(on == false){
            if(channel < 0 || channel < 120){
                channel ++;
            }

        }else{
            System.out.println("ERROR: TV is either OFF or invalid Channel.");
        }

    }

    public void channelDown(){
        if(on == true){
            if(channel > 0 && channel < 120){
                channel --;
            }

        }else{
            System.out.println("ERROR: TV is either OFF or invalid Channel.");
        }
    }

    public void volumeUp(){

        if(on == false){
            if(volumeLevel > 0 && volumeLevel < 7 ){
                volumeLevel++;
            }
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Volume level");


        }
    }

    public void volumeDown(){
        if(on == true){
            if(volumeLevel > 0 || volumeLevel < 7 ){
                volumeLevel--;
            }
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Volume level");

        }
    }

    public void  isOn(){

        if(on !=true){
            System.out.println("TV is already OFF");
        }else{

            System.out.println("TV is already ON");

        }
    }

    public void  turnOn(){

    }
    public void turnOff(){
        if(on == true){
            System.out.println("TV is already OFF");
        }

    }
}
