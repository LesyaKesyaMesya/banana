package exception;

import people.Person;
import yacht.PlaceOnYacht;

public class ClonesAreNotPossible extends RuntimeException{
    public ClonesAreNotPossible(Person person, PlaceOnYacht placeOnYacht){
        super(String.format("%s не может дважды быть на %s.", person, placeOnYacht));
    }
}
