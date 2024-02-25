package people;

import creature.Cthulhu;
import enums.PhysicalState;
import interfaces.Laugh;
import things.Noise;

public class Briden extends Person implements Laugh {
    public Briden(){
        super("Бриден");
    }
    public void laughNextToJohansen(Johansen johansen){
        Noise laugh = new Noise("ахахахахаха");
        System.out.printf("%s издал звук: %s. %n", this, laugh);
        if (johansen.getMentalState().equals("метался в бреду")){
            setPhysicalState(PhysicalState.DEAD);
        }
    }
    public void lookBack(Cthulhu cthulhu, Johansen johansen){
        setMentalState("сошел с ума");
        System.out.printf("%s увидел %s и %s.%n", this, cthulhu, getMentalState());
        laughNextToJohansen(johansen);
    }
}
