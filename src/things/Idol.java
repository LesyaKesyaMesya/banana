package things;

public class Idol {
    private final String mentalEffect;
    public Idol(String mentalEffect){
        this.mentalEffect = mentalEffect;
    }
    public String getMentalEffect(){
        return mentalEffect;
    }
    @Override
    public String toString(){
        return "идол";
    }
}
