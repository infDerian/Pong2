import javafx.scene.layout.Pane;
import javafx.scene.input.KeyEvent;
import javafx.scene.Node;
//import javafx.scene.shape.Shape;

public class Zeichenflaeche extends Pane
{
    //Attribute
    private Ball b;
    private Schlaeger sl, sr;
    
    //Konstruktor
    public Zeichenflaeche()
    {
        setStyle("-fx-background-color: black;");
        setPrefSize(1000,750);
        
        b = new Ball(500, 375);
        sl = new SchlaegerLinks(-100.0, 135.0);
        sl.setRotate(90);
        sr = new SchlaegerRechts(810.0, 595.0);
        sr.setRotate(90);

        getChildren().addAll(b, sl, sr);
    }

    //Methode
    public Zeichenflaeche getZeichenflaeche() {
        return this;
    }
    
    public Schlaeger getSL() {
        return sl;
    }
    
    public Schlaeger getSR() {
        return sr;
    }
    
    public Ball getBall() {
        return b;
    }
}
