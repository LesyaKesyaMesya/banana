package people;

import enums.Speed;
import exception.NotEnoughTime;
import exception.PersonIsNotOnYacht;
import interfaces.Laugh;
import nature.Sea;
import yacht.Cabin;
import yacht.Deck;
import yacht.EngineRoom;
import yacht.Yacht;

public class Johansen extends Person{
    public Johansen(){
        super("Йохансен");
    }
    public void takeControl(Yacht yacht){
        if (yacht.isNotOnYacht(this)&&yacht.getDeck().isNotOnPlace(this)) throw new PersonIsNotOnYacht(this);
        else {
            yacht.getDeck().getWheel().setUnderControl(true);
            System.out.printf("Штурвал под контролем.%n");
        }
    }
    public void run(EngineRoom engineRoom, Deck deck){
        Time time = x -> (int) (Math.random() * x) ;
        int randomTime = time.random(16);
        System.out.printf("%s бегает между %s и %s %s секунд.%n", this, engineRoom, deck, randomTime);
        try {
            if (randomTime < 6) throw new NotEnoughTime(this);
            engineRoom.addPerson(this);
            engineRoom.getMotor().work();
            engineRoom.deletePerson(this);
            deck.addPerson(this);
            takeControl(deck.getYacht());
            deck.deletePerson(this);
        } catch (NotEnoughTime exception){
            System.out.println(exception.getMessage());
            run(engineRoom, deck);
        }
    }
    public void beBrave(Yacht yacht, Sea sea){
        setMentalState("не сдался");
        System.out.printf("Состояние %s: %s.%n", this, getMentalState());
        yacht.getDeck().addPerson(this);
        yacht.go(sea, Speed.FAST, 1, false);
    }
    public void think(Cabin cabin){
        cabin.addPerson(this);
        if(cabin.getIdol().getMentalEffect().equals("сильный")) setMentalState("мрачно размышлял");
        System.out.printf("Состояние %s: %s.%n", this, getMentalState());
    }
    public void createFood(Laugh maniac){
        System.out.printf("%s стряпал нехитрую еду себе и хохочущему %s рядом.%n", this, maniac);
    }
    public void beDepressed(Yacht yacht){
        setMentalState("упадок сил");
        System.out.printf("Состояние %s: %s.%n", this, getMentalState());
        yacht.getDeck().getWheel().setUnderControl(false);
    }
    public void feel(String...thoughts){
        for(String thought:thoughts){
            setMentalState(thought);
            System.out.printf("Состояние %s: %s.%n", this, getMentalState());
        }
    }
}
interface Time{
    int random(int x);
}
