import gpdraw.*;
public class Rectangle {
    private double myX;
    private double myY;
    private double myWidth;
    private double myHeight;
    private DrawingTool pen;
    private SketchPad paper;

    public Rectangle(){

    }

    public Rectangle(double x, double y, double width, double height){
        paper = new SketchPad(900,900);
        pen = new DrawingTool(paper);
        myX = x;
        myY = y;
        myWidth = width;
        myHeight = height;
    }

    public double getPerimeter(){
        double perimeter;
        perimeter = ((2*myWidth)+(2*myHeight));
        return perimeter;
    }

    public double getArea(){
        double area;
        area = (myWidth*myHeight);
        return area;
    }

    public void draw(){
        pen.up();
        pen.move(myX,myY);
        pen.down();
        pen.move((myX+myWidth),myY);
        pen.move((myX+myWidth),(myY+myHeight));
        pen.move(myX,(myY+myHeight));
        pen.move(myX,myY);
    }

    public static void main(String args[]){
        Rectangle rectA = new Rectangle();
        Rectangle rectB = new Rectangle(0, -80, 400, 160);
        Rectangle rectC = new Rectangle(100, -100, 20, 300);
        System.out.println("Rectangle B's Perimeter: " + rectB.getPerimeter());
        System.out.println("Rectangle B's Area: " + rectB.getArea());
        System.out.println("Rectangle C's Perimeter: " + rectC.getPerimeter());
        System.out.println("Rectangle C's Area: " + rectC.getArea());
        rectB.draw();
        rectC.draw();
    }
}
