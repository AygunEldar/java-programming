package day06_arithmetic_operators;

public class moreMathOperators {
    public static void main (String [] args ){
        int toyotas = 431;
        int hondas = 233;
        int vw = 2;
        int tesla = 20;
        int nissan = 1;
        int bmw = 155;
        int total = toyotas+ hondas+vw+tesla+nissan+ bmw;

        System.out.println(total);
        System.out.println("There are " +total +" cars in the parking.");

        String pizza = "hawaiian";
        int slices = 8;
        int  people = 4;
        int slicePerPerson = slices/people;
        System.out.println(slices / people);
        System.out.println("There are " + slicePerPerson + " slices for per person.");
        System.out.println("We ordered " + pizza + " pizza with  " +slices+ " slices, " +  people + " people ate " + slicePerPerson + " slices each.");
    }
}
