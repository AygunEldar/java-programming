package day53_inheritance.tesla;

import day53_inheritance.tesla.ElectricCar;

public class ModelX extends ElectricCar {

    public ModelX(String make, String model, double price, int year, int range) {
        super(make, model, price, year, range);
    }

    /**
     * ERROR: below because method is final , can't be overridden
     */
    //public void charge (){}
}
