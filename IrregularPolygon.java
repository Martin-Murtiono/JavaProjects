import java.awt.geom.*;  // for Point2D.Double
import java.util.ArrayList;      // for ArrayList
import gpdraw.*;        // for DrawingTool

public class IrregularPolygon {
    private ArrayList <Point2D.Double> myPolygon = new ArrayList();
    private SketchPad pad = new SketchPad(500,500);
    private DrawingTool pen = new DrawingTool(pad);

    // constructors
    public IrregularPolygon(){}

    // public methods
    public void add(Point2D.Double aPoint){     // Adds a point into the array
        myPolygon.add(aPoint);
    }

    public void draw(){     // Draws polygon
        pen.up();
        for(Point2D.Double a : myPolygon){      // Draws lines from points - not including last to beginning point
            pen.move(a.getX(), a.getY());
            pen.down();
        }
        Point2D.Double a = myPolygon.get(0);     // Returns line from last to beginning point
        pen.move(a.getX(),a.getY());
    }

    public double perimeter(){      // Calculates perimeter
        double sum = 0;
        double dist;
        for (int i = 0; i < myPolygon.size()-1; i++){       // For loop that calculates distances of points
            Point2D.Double a = myPolygon.get(i);
            Point2D.Double b = myPolygon.get(i+1);
            Point2D.Double c = myPolygon.get(0);
            dist = Math.sqrt((Math.pow((b.getX()- a.getX()),2) + Math.pow((b.getY()- a.getY()),2)));        // Distance Formula
            sum += dist;
            if (i == myPolygon.size()-2){       // Calculates distance between last and beginning point
                dist = Math.sqrt((Math.pow((c.getX()- b.getX()),2) + Math.pow((c.getY()- b.getY()),2)));
                sum += dist;
            }
        }
        return sum;
    }
}
