package creature;

import enums.PhysicalState;
import enums.Speed;
import interfaces.GoInSea;
import nature.Coast;
import nature.Sea;
import things.Noise;
import things.Smell;

public class Cthulhu implements GoInSea {
    private PhysicalState physicalState;
    private final Mouth mouth;
    public Cthulhu(){
        physicalState = PhysicalState.ALIVE;
        mouth = new Mouth();
    }
    private class Mouth{ // не делаю static, тк рот не может существовать без ктулху
        public Noise mumble(){
            return new Noise("рья рья рья");
        }

    }
    public void beOnCoast(Coast coast){
        coast.setCthulhu(this);
        System.out.printf("%s на %s.%n", this, coast);
        System.out.printf("%s издал звук: %s.%n", this, mouth.mumble());
    }
    public void slideDown(Coast coast, Sea sea){
        coast.setCthulhu(null);
        sea.setCthulhu(this);
        System.out.printf("%s маслянисто сполз в воду и кинулся вдогонку.%n", this);
        go(sea, Speed.NORMAL, 2, true);
    }
    public void go(Sea sea, Speed speed, int time, boolean isForward){
        sea.createWaves();
        System.out.printf("%s поплыл в %s.%n", this, sea);
        int step = isForward ? speed.getAmount() : -speed.getAmount();
        for(int i=1; i<=time; i++) {
            sea.setCoordinateCthulhu(sea.getCoordinateCthulhu() + step);
            if(sea.getCoordinateYacht()==sea.getCoordinateCthulhu()) {
                break;
            }
        }
    }
    public void explode(){
        physicalState = PhysicalState.DEAD;
        Noise explosion = new Noise("ба-бах!!!");
        System.out.printf("Раздался звук: %s.%n", explosion);
        class DeadBody{
            public Smell createSmell(){
                return new Smell("ужасный", "зеленый");
            }
            public Cthulhu regeneration(){
                return new Cthulhu();
            }
        }
        DeadBody deadBody = new DeadBody();
        Smell smell = deadBody.createSmell();
        System.out.printf("Раздался %s.%n", smell);
        Cthulhu newCthulhu = deadBody.regeneration();
        System.out.printf("Вязкие ошметки текуче воссоединялись в нового %s.%n", newCthulhu);
    }
    @Override
    public String toString(){
        return "Ктулху";
    }
}
