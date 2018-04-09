package shapeInheritance;

public class Triangle extends Shape {

    private double base;
    private double height;
    private double side;

    public Triangle(String color, double base, double height, double side){
        super(color);
        this.base = base;
        this.height = height;
        this.side = side;


    }


    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea(){
        return super.calculateArea() + ((this.base * this.height) / 2);

    }

    @Override
    public double calculatePerim(){
        return super.calculatePerim() + (this.base + this.side + this.side);
    }

}
