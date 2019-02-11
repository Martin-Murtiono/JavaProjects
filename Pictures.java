import gpdraw.*;

public class Pictures{

    public static SketchPad paper = new SketchPad(500,500);
    public static DrawingTool pen = new DrawingTool(paper);

    public Pictures(){}

    public static void pyramid(int num){
        int i;
        int a;
        for (i = 1; i <= num; i++){
            for (a = 1; a <= num - i; a++){
                System.out.print(" ");
            }
            for (a = 1; a <= i; a++){
                System.out.print("*");
            }
            for (a = 2; a <= i; a++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rainbowBurst(){
        int i;
        for (i = 0; i<=360; i++){
            pen.forward(250);
            pen.backward(250);
            pen.turnRight(1);
        }
    }
}