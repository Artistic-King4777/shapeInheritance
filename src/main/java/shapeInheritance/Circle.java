package shapeInheritance;

public class Circle extends Shape {

    private double radius;

    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return super.calculateArea() + Math.PI * (this.radius * this.radius);
    }

    @Override
    public double calculatePerim(){
        return super.calculatePerim() + (2 * Math.PI * this.radius);
    }


}
