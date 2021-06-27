package day57_abstraction_polymorphism.abst_VS_inter.shapes;

import officehours06_14.C;

import java.util.ArrayList;
import java.util.List;

public class ShapesTest {
    public static void main(String[] args) {

        Shape triangle = new Triangle();
        triangle.draw();

        Shape circle =new Circle();
        circle.draw();

        Shape square =new Square();
        square.draw();

        /**
         * single variable of parent type, and different objects of child types
         */
        Shape shape = new Triangle();
        shape.draw();
        shape = new Circle();
        shape.draw();
        shape = new Square();
        shape.draw();


        /**
         * create list of shapes and store 10 different shapes
         * using a loop print out each shape
         */

        List<Shape>shapes =new ArrayList<>();
        shapes.add(triangle);
        shapes.add(new Triangle());
        shapes.add(new Square());
        shapes.add(new Square());
        shapes.add(new Circle());
        shapes.add(new Circle());
        shapes.add(new Circle());
        shapes.add(new Triangle());
        shapes.add(new Square());
        shapes.add(new Circle());

        //System.out.println(shapes); ERROR it will print Hashcode og objects
        for (Shape eachShape : shapes){
            eachShape.draw();

        }
        drawShape(new Circle());
        drawShape(new Square());
        drawShape(triangle);
    }

    /**
     * static method:drawShape accepts object
     * of shape then calls draw() method
     */
    public static void drawShape(Shape shape){
        System.out.println("******Drawing shape*******");
        shape.draw();
    }
//    public static void drawShape(Square shape){
//        System.out.println("*******Drawing shape*******");
//        shape.draw();
//    }

}
