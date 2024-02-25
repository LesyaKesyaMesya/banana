package yacht.technique;


import yacht.Yacht;

public class Wheel extends Detail{
    private boolean underControl;
    public Wheel(Yacht yacht){
        super(yacht);
    }
    public void setUnderControl(boolean underControl){
        this.underControl = underControl;
    }
    public boolean getUnderControl(){
        return underControl;
    }
}
