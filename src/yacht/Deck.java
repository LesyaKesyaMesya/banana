package yacht;

import yacht.technique.Wheel;

public class Deck extends PlaceOnYacht {
    private final Wheel wheel;
    public Deck(Yacht yacht){
        super(yacht);
        wheel = new Wheel(yacht);
    }
    public Wheel getWheel(){
        return wheel;
    }
    @Override
    public String toString(){
        return "Палуба";
    }
}
