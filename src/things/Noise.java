package things;

public class Noise {
    private final String description;
    public Noise(String description){
        this.description = description;
    }
    @Override
    public String toString(){
        return description;
    }
}
