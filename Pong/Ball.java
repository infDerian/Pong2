import javafx.scene.shape.*;
import javafx.scene.paint.Color;

public class Ball extends Circle
{
    //Attribute
    private double x;
    private double y;
    private double vx;
    private double vy;

    //Konstruktor
    public Ball(double x, double y)
    {
        this.x = x;
        this.y = y;
        vx = 2.0;
        vy = 2.0;
        setCenterX(x);
        setCenterY(y);
        setRadius(15.0f);
        setFill(Color.WHITE);
    }

    //Methoden
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public void setX(double x) {
        this.x = x;
    }
    
    public void setY(double y) {
        this.y = y;
    }
    
    public double getVelocityX() {
        return vx;
    }
    
    public double getVelocityY() {
        return vy;
    }
    
    public void move() {
        x += vx;
        setCenterX(x);
        y += vy;
        setCenterY(y);
    }
    
    public void update() {
        //x = x + v;
        move();
    }
}
