package shapeInheritance;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle("Yellow", 10);
        //System.out.println("The color of this circle is " + circle.color + " and, its area is: " + circle.calculateArea());

        Shape rectangle = new Rectangle("Blue", 10, 6);
        //System.out.println("===================================================================");
        //System.out.println("The color of this rectangle is " + rectangle.color + " and, its area is: " + rectangle.calculateArea());

        Shape square = new Square("Pink", 10);
        //System.out.println("===================================================================");
        //System.out.println("The color of this square is " + square.color + " and, its area is: " + square.calculateArea());

        Shape triangle = new Triangle("White", 10, 5, 5);
        //System.out.println("===================================================================");
        //System.out.println("The color of this triangle is " + triangle.color + " and, its area is: " + triangle.calculateArea());

        Shape[] shapes = new Shape[]{circle, rectangle, square, triangle};
        for(Shape shape: shapes){
            System.out.print("\n" + "Color: " + shape.color + " || Area: " + shape.calculateArea() + " || Perimeter: " + shape.calculatePerim());
        }




    }

}
