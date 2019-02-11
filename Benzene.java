// Martin Murtiono, This program draws a circle inside of a hexagon.
import gpdraw.*;
public class Benzene {
    private DrawingTool myPencil;
    private SketchPad myPaper;

    public Benzene(){
        myPaper = new SketchPad(500,500);
        myPencil = new DrawingTool(myPaper);
    }

    public void drawHexagon(int side){
        int i = 0;
        myPencil.up();
        myPencil.move(0,side);
        myPencil.down();
        myPencil.setDirection(330);
        for(i=0;i<6;i++) {
            myPencil.forward(side);
            myPencil.turnRight(60);
        }
    }
    public void drawCir(int radius){
        myPencil.drawCircle(radius);
    }
    public static void main (String args[]){
        Benzene benOne = new Benzene();
        benOne.drawCir(200);
        benOne.drawHexagon(300);
    }
}
