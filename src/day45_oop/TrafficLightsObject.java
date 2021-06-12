package day45_oop;

public class TrafficLightsObject {
    public static void main(String[] args) {

        //create trafficLightObj

        TrafficLights tL = new TrafficLights();

        //trafficLights.color = "red";
        //we will assign/update the value of color  using a method of the class

       tL.changeColor("red");
       // System.out.println(tL.color);DIRECT  access to variable. NOT recommended
// call method to access the variable
        tL.showColor();
        System.out.println("*****************");
        tL.changeColor("green");
        tL.showColor();
        System.out.println("########################");

        TrafficLights trafficLight2 =new TrafficLights();
        trafficLight2.changeColor("blue") ;
        trafficLight2.showColor();

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        TrafficLights trafficLight3 =new TrafficLights();
        trafficLight3.changeColor("yellow");
        trafficLight3.showColor();
    }


}
