package shapeInheritance;

public class Square extends Shape {

    private double side;

    public Square(String color, double side){
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea(){
        return super.calculateArea() + this.side * this.side;
    }

    @Override
    public double calculatePerim(){
        return super.calculatePerim() + (4 * this.side);
    }

}
