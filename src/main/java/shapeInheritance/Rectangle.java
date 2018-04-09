package shapeInheritance;

public class Rectangle extends Shape {


    private double length;
    private double width;


    public Rectangle(String color, double length, double width){
        super(color);
        this.length = length;
        this.width = width;
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea(){
        return super.calculateArea() + length * width ;
    }

    @Override
    public double calculatePerim(){
        return super.calculatePerim() + (2 * (length + width));
    }

//C:\Users\Frost\IdeaProjects\helloworld\src\main\java\shapeInheritance

}
