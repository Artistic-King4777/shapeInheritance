package shapeInheritance;

public class Shape {// THIS IS PARENT/SUPER CLASS
    //all have the calculateArea similarly

   /*
   Shape class is super class
   has one method calculateArea and one default constructor

   extend to create a circle triangle square and rectangle -- with instance variables

   Main - create your objects for each shape

   create an array of shapes, loop throo and print out the calculateArea for each shape
    */


    protected String color;

    //default constructor
    public Shape(String color){
        this.color = color;
    }


    //methods


//    public String getShape() {
//        return shape;
//    }
//
//    public void setShape(String shape) {
//        this.shape = shape;
//    }

    public double calculateArea(){
        return 0.0;
    }

    public double calculatePerim(){
        return 0.0;
    }





}

