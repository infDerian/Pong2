import javafx.scene.shape.*;
import javafx.scene.paint.Color;

public class Schlaeger extends Rectangle
{
    //Attribute
    private double v, x, y;
    
    public Schlaeger(double x, double y)
    {
        setX(x);
        setY(y);
        setWidth(300);
        setHeight(30);
        setFill(Color.WHITE);
    }
    
    //Methoden
    public double getVelocity() {
        return v;
    }
    
    public double gebeY() {
        return y;
    }
    
    public double gebeX() {
        return x; 
    }
    
    public void runter() {
        double yCoord = getY() + 10;
        setY(yCoord);
    }
    
    public void hoch() {
        double yCoord = getY() - 10;
        setY(yCoord);
    }
    
    public void update() {
        y = y + v;
        setY(y);
    }
}