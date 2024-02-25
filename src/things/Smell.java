package things;

public class Smell {
    private final String flavor;
    private final String color;
    public Smell(String flavor, String color){
        this.flavor = flavor;
        this.color = color;
    }
    @Override
    public String toString(){
        return String.format("%s %s запах", color, flavor);
    }
}
