package exception;

import people.Person;

public class NotEnoughTime extends Exception{
    public NotEnoughTime(Person person){
        super(String.format("%s мало бегал. Надо еще.", person));
    }
}
