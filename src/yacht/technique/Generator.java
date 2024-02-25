package yacht.technique;

import yacht.Yacht;

public class Generator extends Detail{
    private boolean isOn;
    public Generator(Yacht yacht){
        super(yacht);
    }
    public void setOn(boolean isOn){
        this.isOn = isOn;
    }
    public boolean getOn(){
        return isOn;
    }
}
