package day59_polymorphism_exceptions;

import day57_abstraction_polymorphism.abst_VS_inter.shapes.Circle;
import day57_abstraction_polymorphism.abst_VS_inter.shapes.Shape;
import day57_abstraction_polymorphism.abst_VS_inter.shapes.Square;

public class InstanceOf {
    public static void main(String[] args) {

        //instanceof operator

        Shape shape = new Circle(); //new Square();

        System.out.println(shape instanceof  Circle);
        System.out.println(shape instanceof Square);

       if(shape instanceof  Circle){
           System.out.println("It is a Circle object");
       }else if(shape instanceof Square){
           System.out.println("It is a Square object");
       }
        /**
         * java reflection  API
         */

        System.out.println(shape.getClass().getSimpleName());//just class name object
        System.out.println(shape.getClass().getName()); //gives whole package ,class name object

        if (shape.getClass().getSimpleName().equals("Square")){
            System.out.println("It is a square object");

        }

        System.out.println(shape.getClass().getDeclaredMethods().length);// 1 - this class has 1 method

        WebElement el =new Link();
        System.out.println(" Object class name of el variable == "+el.getClass().getSimpleName());
        //System.out.println(el.getClass().getDeclaredFields());
    }


}
