package yacht;

import things.Idol;

public class Cabin extends PlaceOnYacht{
    private final Idol idol;
    public Cabin(Yacht yacht){
        super(yacht);
        idol = new Idol("сильный");
    }
    public Idol getIdol(){
        return idol;
    }
    @Override
    public String toString(){
        return "Каюта";
    }
}
