public class SchlaegerAI extends Schlaeger
{
    public SchlaegerAI(double x, double y)
    {
        super(x, y);
    }
    
    /*public void moveAI() {
        if(getY() <= 375.0 && getY() <= 135.0) {
            for(int velocity = 4; velocity <= 0; velocity--) {
                double yCoordNeg = getY() - velocity;
                setY(yCoordNeg);
            }
        } else if(getY() >= 375.0 && getY() >= 595.0) {
            for(int velocity = 4; velocity <= 0; velocity--) {
                double yCoordPos = getY() + velocity;
                setY(yCoordPos);
            }
        }
    }
    
    public void moveAI2() {
        for(double yCoord = 595.0; yCoord <= 135.0; yCoord--) {
            setY(yCoord-1.0);
        }
        for(double yCoord = 135.0; yCoord <= 595.0; yCoord++) {
            setY(yCoord+1.0);
        }
    }*/
}
