package day56_abstraction.drivable;

public interface SelfDrivable {
    void autoPilot();

    //void selfPark(); this cause ERROR in sub classes, because they must again override
    public default void selfPark(){ //if we add default method , it will prevent error
        System.out.println("Performing self park steps");

    }
}
