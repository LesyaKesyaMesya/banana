package yacht.technique;

import yacht.Yacht;

public abstract class Detail {
    private final Yacht yacht;
    public Detail(Yacht yacht){
        this.yacht=yacht;
    }
    public Yacht getYacht(){
        return yacht;
    }
}
