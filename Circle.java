import gpdraw.*;
public class Circle{
    private double myX;
    private double myY;
    private double myRadius;
    private DrawingTool pen;
    private SketchPad paper;

    public Circle(){

    }

    public Circle(double x, double y, double radius){
        paper = new SketchPad(900,900);
        pen = new DrawingTool(paper);
        myX = x;
        myY = y;
        myRadius = radius;
    }

    public double getCircumference(){
        double perimeter;
        perimeter = (2 * Math.PI * myRadius);
        return perimeter;
    }

    public double getArea(){
        double area;
        area = (Math.PI * Math.pow(myRadius, 2));
        return area;
    }

    public void draw(){
        pen.up();
        pen.move(myX,myY);
        pen.down();
        pen.drawCircle(myRadius);
    }

    public static void main(String args[]){
        Circle circA = new Circle();
        Circle circB = new Circle(-200,100,150);
        Circle circC = new Circle(100,-50,250);
        System.out.println("Rectangle.Circle B's Circumference: " + circB.getCircumference());
        System.out.println("Rectangle.Circle B's Area: " + circB.getArea());
        System.out.println("Rectangle.Circle C's Circumference: " + circC.getCircumference());
        System.out.println("Rectangle.Circle C's Area: " + circC.getArea());
        circB.draw();
        circC.draw();
    }
}