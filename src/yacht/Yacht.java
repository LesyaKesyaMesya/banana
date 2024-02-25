package yacht;

import enums.Speed;
import interfaces.GoInSea;
import nature.Sea;
import people.Briden;
import people.Johansen;
import people.Person;

public class Yacht implements GoInSea {
    private final Person[] team = new Person[2];
    private final Deck deck = new Deck(this);
    private final EngineRoom engineRoom = new EngineRoom(this);
    private final Cabin cabin = new Cabin(this);
    public Yacht(Johansen johansen, Briden briden){
        team[0] = johansen;
        team[1] = briden;
        engineRoom.getGenerator().setOn(true);
        System.out.printf("Несмотря на то, что вся команда сошла на берег, паровой котел не был отключен вовсе.%n");
    }
    public Deck getDeck(){
        return deck;
    }
    public EngineRoom getEngineRoom(){
        return engineRoom;
    }
    public Cabin getCabin(){
        return cabin;
    }
    public int getCapacity(){
        return team.length;
    }
    public void go(Sea sea, Speed speed, int step, boolean isForward){
        if (engineRoom.getMotor().getIsWork() && deck.getWheel().getUnderControl()) {
            sea.createWaves();
            System.out.printf("Яхта поплыла в %s.%n", sea);
            step = isForward? step : -step;
            for(int i=1; i<=speed.getAmount(); i++) {
                sea.setCoordinateYacht(sea.getCoordinateYacht() + step);
                if(sea.getCoordinateYacht()==sea.getCoordinateCthulhu()) {
                    break;
                }
            }
        }
    }
    public boolean isNotOnYacht(Person person){
        for(int i = 0; i<team.length; i++){
            if (person.equals(team[i])) {
                return false;
            }
        }
        return true;
    }
    @Override
    public String toString(){
        return "Яхта";
    }
}
