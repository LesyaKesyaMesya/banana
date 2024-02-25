package yacht;

import yacht.technique.Generator;
import yacht.technique.Motor;

public class EngineRoom extends PlaceOnYacht {
    private final Generator generator;
    private final Motor motor;
    public EngineRoom(Yacht yacht){
        super(yacht);
        generator = new Generator(yacht);
        motor = new Motor(yacht);
    }
    public Generator getGenerator(){
        return generator;
    }
    public Motor getMotor(){
        return motor;
    }
    @Override
    public String toString(){
        return "Машинное отделение";
    }
}
