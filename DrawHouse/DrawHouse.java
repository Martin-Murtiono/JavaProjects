import gpdraw.*;
public class DrawHouse{
    private DrawingTool myPencil;
    private SketchPad myPaper;

    public DrawHouse(){
        myPaper = new SketchPad(500,500);
        myPencil = new DrawingTool(myPaper);
    }
    public void draw(){
        int i = 0;
        myPencil.up();
        myPencil.move(200, -200);
        myPencil.setDirection(90);
        myPencil.down();
        myPencil.forward(250);
        myPencil.turnLeft();
        myPencil.forward(400);
        myPencil.turnLeft();
        myPencil.forward(250);
        myPencil.turnLeft();
        myPencil.forward(400);
        myPencil.up();
        myPencil.move(200,50);
        myPencil.down();
        myPencil.move(0, 200);
        myPencil.move(-200, 50);
        myPencil.up();
        myPencil.move(30, -200);
        myPencil.down();
        myPencil.setDirection(90);
        myPencil.forward(100);
        myPencil.turnLeft();
        myPencil.forward(60);
        myPencil.turnLeft();
        myPencil.forward(100);
        myPencil.up();
        myPencil.move(150, -125);
        myPencil.setDirection(90);
        myPencil.down();
        myPencil.forward(100);
        myPencil.turnLeft();
        myPencil.forward(50);
        myPencil.turnLeft();
        myPencil.forward(100);
        myPencil.turnLeft();
        myPencil.forward(50);
        myPencil.turnLeft();
        myPencil.forward(50);
        myPencil.turnLeft();
        myPencil.forward(50);
        myPencil.up();
        myPencil.move(-150,-125);
        myPencil.setDirection(90);
        myPencil.down();
        myPencil.forward(100);
        myPencil.turnRight();
        myPencil.forward(50);
        myPencil.turnRight();
        myPencil.forward(100);
        myPencil.turnRight();
        myPencil.forward(50);
        myPencil.turnRight();
        myPencil.forward(50);
        myPencil.turnRight();
        myPencil.forward(50);
        myPencil.up();

    }
    public static void main (String args[]){
        DrawHouse house = new DrawHouse();
        house.draw();
    }
}
