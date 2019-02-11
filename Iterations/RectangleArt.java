import gpdraw.*;
public class RectangleArt {
    public static void main(String[] args){
        rectangleArt();
    }
    public static void drawLine(SketchPad paper, double x1, double y1, double x2, double y2){
        DrawingTool pen = new DrawingTool(paper);
        pen.up();
        pen.move(x1,y1);
        pen.down();
        pen.move(x2,y2);
    }
    public static void rectangleArt(){
        double width = 500;
        double height = 315;
        double x1 = 0;
        double y1 = 315;
        double x2 = 500;
        double y2 = 315;
        SketchPad paper = new SketchPad(1100,750);
        DrawingTool pen = new DrawingTool(paper);
        pen.drawRect(1000,630);

        for (int i = 0; i < 50; i++){
            x1 += width/50;
            y2 -=height/50;
            drawLine(paper,x1,y1,x2,y2);
        }
        for (int i = 0; i < 50; i++){
            x2 -= width/50;
            y1 -=height/50;
            drawLine(paper,x1,y1,x2,y2);
        }
        for (int i = 0; i < 50; i++){
            x1 -= width/50;
            y2 +=height/50;
            drawLine(paper,x1,y1,x2,y2);
        }
        for (int i = 0; i < 50; i++){
            x2 += width/50;
            y1 +=height/50;
            drawLine(paper,x1,y1,x2,y2);
        }
    }
}
