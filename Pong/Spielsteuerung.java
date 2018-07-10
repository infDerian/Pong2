import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;
import javafx.application.Platform;

public class Spielsteuerung
{
    //Attribute
    private Zeichenflaeche f;
    private Schlaeger sl, sr;
    private Ball b;
    private Timer t;

    //Konstruktor
    public Spielsteuerung()
    {
        f = new Zeichenflaeche();
        t = new Timer(this);
        sl = f.getSL();
        sr = f.getSR();
        b = f.getBall();
        

    }

    //Methoden
    public Zeichenflaeche getZeichenflaeche() {
        return f;
    }
    
    /*public void pressed(KeyEvent event) {
        if(event.getCode() == KeyCode.W) {
            s1.hoch();
        }
        if(event.getCode() == KeyCode.S) {
            s1.runter();
        }
        if(event.getCode() == KeyCode.UP) {
            s2.hoch();
        }
        if(event.getCode() == KeyCode.DOWN) {
            s2.runter();
        }
        if(event.getCode() == KeyCode.X) {
            Platform.exit();
        }
    }*/

    public void pressed(KeyCode kc) {
        if(kc == KeyCode.W) {
            if((sl.getY()-135.0D) < f.getMinHeight()) {
                sl.runter();
            } else {
                sl.hoch();
            }
        }
        if(kc == KeyCode.S) {
            if((sl.getY()-595.0D) > f.getMaxHeight()) {
                sl.hoch();
            } else {
                sl.runter();
            }
        }
        if(kc == KeyCode.UP) {
            if((sr.getY()-135.0D) < f.getMinHeight()) {
                sr.runter();
            } else {
                sr.hoch();
            }
        }
        if(kc == KeyCode.DOWN) {
            if((sr.getY()-595.0D) > f.getMaxHeight()) {
                sr.hoch();
            } else {
                sr.runter();
            }
        }
        if(kc == KeyCode.X) {
            Platform.exit();
        }
         if(kc == KeyCode.SPACE) {
           t.start();
        }
    }

    public void update() {
        sl.update();
        sr.update();
        b.update();
    }

    /*public void runter(Schlaeger s) {
    double yCoord = s.getY() + 2;
    s.setY(yCoord);
    }

    public void hoch(Schlaeger s) {
    double yCoord = s.getY() - 2;
    s.setY(yCoord);
    }*/
}
